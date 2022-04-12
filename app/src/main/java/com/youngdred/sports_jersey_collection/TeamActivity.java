package com.youngdred.sports_jersey_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TeamActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        
    }

    private int getTeam(){
        Intent teamIntent=getIntent();
        int teamId=teamIntent.getIntExtra("teamId",0);
        return teamId;
    }

    private void updateTeamPage(){
        int teamId=getTeam();

    }
}