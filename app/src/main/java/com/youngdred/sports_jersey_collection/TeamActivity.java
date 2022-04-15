package com.youngdred.sports_jersey_collection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.youngdred.sports_jersey_collection.items.Jersey;
import com.youngdred.sports_jersey_collection.items.Team;

import java.util.HashMap;
import java.util.Map;

public class TeamActivity extends AppCompatActivity {

    ImageView teamLogo;
    TextView teamName;
    View firstView, secondView, thirdView, fourthView;
    TextView firstTV, secondTV, thirdTV, fourthTV;
    ImageView firstIV, secondIV, thirdIV, fourthIV;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Team t = new Team("---", "---", "---", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        teamLogo = (ImageView) findViewById(R.id.iv_team_page_logo);
        teamName = (TextView) findViewById(R.id.tv_team_page_team_name);

        firstView = (View) findViewById(R.id.include_first_jersey);
        firstIV = (ImageView) firstView.findViewById(R.id.iv_jersey_picture);
        firstTV = (TextView) firstView.findViewById(R.id.tv_jersey_name);

        secondView = (View) findViewById(R.id.include_second_jersey);
        secondIV = (ImageView) secondView.findViewById(R.id.iv_jersey_picture);
        secondTV = (TextView) secondView.findViewById(R.id.tv_jersey_name);

        thirdView = (View) findViewById(R.id.include_third_jersey);
        thirdIV = (ImageView) thirdView.findViewById(R.id.iv_jersey_picture);
        thirdTV = (TextView) thirdView.findViewById(R.id.tv_jersey_name);

        fourthView = (View) findViewById(R.id.include_fourth_jersey);
        fourthIV = (ImageView) fourthView.findViewById(R.id.iv_jersey_picture);
        fourthTV = (TextView) fourthView.findViewById(R.id.tv_jersey_name);

        readTeam();
        getJerseys();
    }

    private int getTeam() {
        Intent teamIntent = getIntent();
        return teamIntent.getIntExtra("teamID", 15);
    }

    private void updateTeamData(Team t) {
        teamName.setText(t.name);
    }

    private void readTeam() {

        int teamId = getTeam();
        db.collection("teams")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                int td = Integer.parseInt(String.valueOf(document.get("teamID")));
                                if (td == teamId) {
                                    String c = String.valueOf(document.get("country"));
                                    String l = String.valueOf(document.get("league"));
                                    String n = String.valueOf(document.get("name"));
                                    Team t = new Team(n, c, l, teamId);
                                    updateTeamData(t);
                                }
                            }
                        } else {
                        }
                    }
                });
    }

    private void updateJersey(Jersey j, int index) {
        String text=j.year+" "+j.edition;
        switch (index){
            case 0:
                firstTV.setText(text);
                int resID = getResources().getIdentifier(j.image , "drawable", getPackageName());
                firstIV.setImageResource(resID);
                break;
            case 1:
                secondTV.setText(text);
                break;
            case 2:
                thirdTV.setText(text);
                break;
            case 3:
                fourthTV.setText(text);
                break;
        }
    }

    private void getJerseys() {
        db.collection("jerseys")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            int index = 0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                //Cambiar fotos
                                Map<String,Object> teamMap= (Map<String, Object>) document.get("team");
                                Team t= new Team(String.valueOf(teamMap.get("name")),
                                        String.valueOf(teamMap.get("country")),
                                        String.valueOf(teamMap.get("league")),
                                        Integer.parseInt(String.valueOf(teamMap.get("teamID"))));

                                int docTeamID=t.teamID;
                                if(docTeamID==getTeam() && index<4){
                                    int jid=Integer.parseInt(String.valueOf(document.get("jerseyId")));
                                    String color=String.valueOf(document.get("color"));
                                    int y=Integer.parseInt(String.valueOf(document.get("year")));
                                    String sport=String.valueOf(document.get("sport"));
                                    String edition=String.valueOf(document.get("edition"));
                                    String image=String.valueOf(document.get("image"));
                                    Jersey j= new Jersey(t,jid,color,y,sport,edition,image);
                                    updateJersey(j,index);
                                    index++;
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
        /*
        private void fillDB() {

            String[] teamNames = {"Atlanta Hawks",
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

            for (int i = 1; i < 31; i++) {
                Map<String, Object> team = new HashMap<>();
                team.put("name", teamNames[i - 1]);
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
*/


        private void fillJerseys() {

            String[] teamNames = {"Atlanta Hawks",
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

            for (int i = 1; i < 31; i++) {
                Team t=new Team(teamNames[i-1],"USA","NBA",i);
                Jersey j= new Jersey(t,i,"Black",2022,"Basketball","City Edition","nba_logo.png");

                // Add a new document with a generated ID
                db.collection("jerseys")
                        .add(j)
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