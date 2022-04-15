package com.youngdred.sports_jersey_collection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.youngdred.sports_jersey_collection.items.Team;

import java.util.HashMap;
import java.util.Map;

public class TeamActivity extends AppCompatActivity {

    ImageView teamLogo;
    TextView teamName;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Team t= new Team("---","---","---",0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        teamLogo=(ImageView) findViewById(R.id.iv_team_page_logo);
        teamName=(TextView) findViewById(R.id.tv_team_page_team_name);

        readTeam();
    }

    private int getTeam(){
        Intent teamIntent=getIntent();
        int teamId=teamIntent.getIntExtra("teamID",15);
        return teamId;
    }

    private void updateTeamPage(Team t){
        teamName.setText(t.name);
    }

    private void readTeam(){

        int teamId=getTeam();
        db.collection("teams")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                int td=Integer.parseInt(String.valueOf(document.get("teamID")));
                                if(td==teamId){
                                    String c= String.valueOf(document.get("country"));
                                    String l= String.valueOf(document.get("league"));
                                    String n=String.valueOf(document.get("name"));
                                    Team t= new Team(n,c,l,teamId);
                                    updateTeamPage(t);
                                }
                            }
                        } else {
                        }
                    }
                });
    }
/*
    private void readDB(){
        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }
*/
    private void fillDB(){

        String[] teamNames= {"Atlanta Hawks",
                "Boston Celtics",
                "Brooklyn Nets",
                "Charlotte Hornets",
                "Chicago Bulls",
                "Cleveland Cavaliers",
                "Dallas Mavericks",
                "Denver Nuggets",
                "Detroit Pistons",
                "Golden State Warriors",
                "Houston Rockets",
                "Indiana Pacers",
                "LA Clippers",
                "LA Lakers",
                "Memphis Grizzlies",
                "Miami Heat",
                "Milwaukee Bucks",
                "Minnesota Timberwolves",
                "New Orleans Hornets",
                "New York Knicks",
                "Oklahoma City Thunder",
                "Orlando Magic",
                "Philadelphia Sixers",
                "Phoenix Suns",
                "Portland Trail Blazers",
                "Sacramento Kings",
                "San Antonio Spurs",
                "Toronto Raptors",
                "Utah Jazz",
                "Washington Wizards"};

        for(int i=1;i<31;i++){
            Map<String, Object> team = new HashMap<>();
            team.put("name", teamNames[i-1]);
            team.put("country", "USA");
            team.put("league", "NBA");
            team.put("teamID", i);

            // Add a new document with a generated ID
            db.collection("teams")
                    .add(team)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                        }
                    });
        }
    }
}