package com.youngdred.sports_jersey_collection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.youngdred.sports_jersey_collection.items.Jersey;
import com.youngdred.sports_jersey_collection.items.Team;

import java.util.Map;

public class JerseyActivity extends AppCompatActivity {

    int page=0, maxNumberOfPages=10000;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    View firstView,secondView,thirdView,fourthView;
    TextView firstTV,secondTV,thirdTV,fourthTV;
    ImageView firstIV,secondIV,thirdIV,fourthIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jersey);

        View colorsView=findViewById(R.id.include_colors_filter);
        Spinner colorsSpinner=colorsView.findViewById(R.id.spinner_filter);
        ArrayAdapter<CharSequence> colorAdapter = ArrayAdapter.createFromResource(this,
                R.array.colors_array, android.R.layout.simple_spinner_item);
        colorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorsSpinner.setAdapter(colorAdapter);
        TextView colorsTV=colorsView.findViewById(R.id.tv_filter_label);
        colorsTV.setText(R.string.color);

        View sportsView=findViewById(R.id.include_sports_filter);
        Spinner sportsSpinner=sportsView.findViewById(R.id.spinner_filter);
        ArrayAdapter<CharSequence> sportsAdapter = ArrayAdapter.createFromResource(this,
                R.array.sports_array, android.R.layout.simple_spinner_item);
        sportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sportsSpinner.setAdapter(sportsAdapter);
        TextView sportsTV=sportsView.findViewById(R.id.tv_filter_label);
        sportsTV.setText(R.string.sport);

        View yearsView=findViewById(R.id.include_years_filter);
        Spinner yearsSpinner=yearsView.findViewById(R.id.spinner_filter);
        ArrayAdapter<CharSequence> yearsAdapter = ArrayAdapter.createFromResource(this,
                R.array.years_array, android.R.layout.simple_spinner_item);
        yearsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearsSpinner.setAdapter(yearsAdapter);
        TextView yearsTV=yearsView.findViewById(R.id.tv_filter_label);
        yearsTV.setText(R.string.year);

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

        Button seeMoreJerseysButton=findViewById(R.id.see_more_jerseys_btn);
        seeMoreJerseysButton.setOnClickListener(view -> getJerseys());

        getJerseys();
    }

    public void resetJerseys(){
        firstTV.setText("");
        thirdTV.setText("");
        secondTV.setText("");
        fourthTV.setText("");

        firstIV.setImageResource(0);
        secondIV.setImageResource(0);
        thirdIV.setImageResource(0);
        fourthIV.setImageResource(0);

    }

    private void updateJersey(Jersey j, int index) {

        String text=j.team.name+" "+j.year+" "+j.edition;
        int resID = getResources().getIdentifier(j.image , "drawable", getPackageName());
        switch (index){
            case 0:
                firstTV.setText(text);
                firstIV.setImageResource(resID);
                break;
            case 1:
                secondTV.setText(text);
                secondIV.setImageResource(resID);
                break;
            case 2:
                thirdTV.setText(text);
                thirdIV.setImageResource(resID);
                break;
            case 3:
                fourthTV.setText(text);
                fourthIV.setImageResource(resID);
                break;
        }
    }

    private void getJerseys() {
        resetJerseys();

        if(page==maxNumberOfPages){
            page=0;
        }

        db.collection("jerseys")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            int index = 0, totalItems=4*page, currentItem=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                //Cambiar fotos
                                Map<String,Object> teamMap= (Map<String, Object>) document.get("team");
                                Team t= new Team(String.valueOf(teamMap.get("name")),
                                        String.valueOf(teamMap.get("country")),
                                        String.valueOf(teamMap.get("league")),
                                        Integer.parseInt(String.valueOf(teamMap.get("teamID"))));

                                if(index<4 && currentItem>=totalItems){
                                    int jid=Integer.parseInt(String.valueOf(document.get("jerseyId")));
                                    String color=String.valueOf(document.get("color"));
                                    int y=Integer.parseInt(String.valueOf(document.get("year")));
                                    String sport=String.valueOf(document.get("sport"));
                                    String edition=String.valueOf(document.get("edition"));
                                    String image=String.valueOf(document.get("image"));
                                    Jersey j= new Jersey(t,jid,color,y,sport,edition,image);
                                    updateJersey(j,index);
                                    index++;
                                }else{
                                }
                                currentItem++;
                            }
                            page++;
                            maxNumberOfPages=1+(currentItem/4);

                        } else {
                        }
                    }
                });
    }

}