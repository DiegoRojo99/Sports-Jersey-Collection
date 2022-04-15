package com.youngdred.sports_jersey_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nbaButton=findViewById(R.id.home_nba_btn);
        nbaButton.setOnClickListener(view -> goToNBA());

        Button teamButton=findViewById(R.id.home_team_btn);
        teamButton.setOnClickListener(view -> goToTeam());

    }

    void goToNBA(){
        Intent NBAintent=new Intent(LoginActivity.this, NBA_Activity.class);
        startActivity(NBAintent);
    }
    void goToTeam(){
        Intent teamIntent=new Intent(LoginActivity.this, JerseyActivity.class);
        startActivity(teamIntent);
    }
}