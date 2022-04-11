package com.youngdred.sports_jersey_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NBA_Activity extends AppCompatActivity {

    ImageView atlIV, bosIV, bknIV, chaIV, chiIV, cleIV, detIV, indIV, miaIV, milIV, nykIV, orlIV, phiIV, torIV, wasIV;
    TextView atlTV, bosTV, bknTV, chaTV, chiTV, cleTV, detTV, indTV, miaTV, milTV, nykTV, orlTV, phiTV, torTV, wasTV;
    View atlV, bosV, bknV, chaV, chiV, cleV, detV, indV, miaV, milV, nykV, orlV, phiV, torV, wasV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);

        atlV=findViewById(R.id.include_atlanta_hawks_team);
        atlTV=atlV.findViewById(R.id.tv_team_name);
        atlTV.setText(R.string.atl);
        atlIV=atlV.findViewById(R.id.iv_team_image);
        atlIV.setImageResource(R.drawable.atlanta_hawks_logo);

        bosV=findViewById(R.id.include_boston_celtics_team);
        bosTV=bosV.findViewById(R.id.tv_team_name);
        bosTV.setText(R.string.bos);
        bosIV=bosV.findViewById(R.id.iv_team_image);
        //bosIV.setImageResource(R.drawable.boston_celtics_logo);

        bknV=findViewById(R.id.include_brooklyn_nets_team);
        bknTV=bknV.findViewById(R.id.tv_team_name);
        bknTV.setText(R.string.bkn);
        bknIV=bknV.findViewById(R.id.iv_team_image);
        bknIV.setImageResource(R.drawable.brooklyn_nets_logo);

        chaV=findViewById(R.id.include_charlotte_hornets_team);
        chaTV=chaV.findViewById(R.id.tv_team_name);
        chaTV.setText(R.string.cha);
        chaIV=chaV.findViewById(R.id.iv_team_image);
        //chaIV.setImageResource(R.drawable.charlotte_hornets_logo);

        chiV=findViewById(R.id.include_chicago_bulls_team);
        chiTV=chiV.findViewById(R.id.tv_team_name);
        chiTV.setText(R.string.chi);
        chiIV=chiV.findViewById(R.id.iv_team_image);
        //chaIV.setImageResource(R.drawable.charlotte_hornets_logo);

        torV=findViewById(R.id.include_toronto_raptors_team);
        torTV=torV.findViewById(R.id.tv_team_name);
        torTV.setText(R.string.tor);
        torIV=torV.findViewById(R.id.iv_team_image);
        torIV.setImageResource(R.drawable.toronto_raptors_logo);
    }
}