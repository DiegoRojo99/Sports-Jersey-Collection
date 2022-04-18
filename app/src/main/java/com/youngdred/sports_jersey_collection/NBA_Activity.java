package com.youngdred.sports_jersey_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NBA_Activity extends AppCompatActivity implements View.OnClickListener{

    ImageView atlIV, bosIV, bknIV, chaIV, chiIV, cleIV, detIV, indIV, miaIV, milIV, nykIV, orlIV, phiIV, torIV, wasIV;
    TextView atlTV, bosTV, bknTV, chaTV, chiTV, cleTV, detTV, indTV, miaTV, milTV, nykTV, orlTV, phiTV, torTV, wasTV;
    View atlV, bosV, bknV, chaV, chiV, cleV, detV, indV, miaV, milV, nykV, orlV, phiV, torV, wasV;

    ImageView nbaIV, eastIV, westIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);

        nbaIV=findViewById(R.id.iv_nba_logo);
        nbaIV.setImageResource(R.drawable.nba_logo);

        atlV=findViewById(R.id.include_atlanta_hawks_team);
        atlTV=atlV.findViewById(R.id.tv_team_name);
        atlTV.setText(R.string.atl);
        atlIV=atlV.findViewById(R.id.iv_team_image);
        atlIV.setImageResource(R.drawable.atlanta_hawks_logo);
        atlIV.setOnClickListener(this);

        bosV=findViewById(R.id.include_boston_celtics_team);
        bosTV=bosV.findViewById(R.id.tv_team_name);
        bosTV.setText(R.string.bos);
        bosIV=bosV.findViewById(R.id.iv_team_image);
        bosIV.setImageResource(R.drawable.boston_celtics_logo);
        bosIV.setOnClickListener(this);

        bknV=findViewById(R.id.include_brooklyn_nets_team);
        bknTV=bknV.findViewById(R.id.tv_team_name);
        bknTV.setText(R.string.bkn);
        bknIV=bknV.findViewById(R.id.iv_team_image);
        bknIV.setImageResource(R.drawable.brooklyn_nets_logo);
        bknIV.setOnClickListener(this);

        chaV=findViewById(R.id.include_charlotte_hornets_team);
        chaTV=chaV.findViewById(R.id.tv_team_name);
        chaTV.setText(R.string.cha);
        chaIV=chaV.findViewById(R.id.iv_team_image);
        chaIV.setImageResource(R.drawable.charlotte_hornets_logo);
        chaIV.setOnClickListener(this);

        chiV=findViewById(R.id.include_chicago_bulls_team);
        chiTV=chiV.findViewById(R.id.tv_team_name);
        chiTV.setText(R.string.chi);
        chiIV=chiV.findViewById(R.id.iv_team_image);
        chiIV.setImageResource(R.drawable.chicago_bulls_logo);
        chiIV.setOnClickListener(this);

        cleV=findViewById(R.id.include_cleveland_cavaliers_team);
        cleTV=cleV.findViewById(R.id.tv_team_name);
        cleTV.setText(R.string.cle);
        cleIV=cleV.findViewById(R.id.iv_team_image);
        cleIV.setImageResource(R.drawable.cleveland_cavaliers_logo);
        cleIV.setOnClickListener(this);

        detV=findViewById(R.id.include_detroit_pistons_team);
        detTV=detV.findViewById(R.id.tv_team_name);
        detTV.setText(R.string.cle);
        detIV=detV.findViewById(R.id.iv_team_image);
        detIV.setImageResource(R.drawable.detroit_pistons_logo);
        detIV.setOnClickListener(this);

        indV=findViewById(R.id.include_indiana_pacers_team);
        indTV=indV.findViewById(R.id.tv_team_name);
        indTV.setText(R.string.ind);
        indIV=indV.findViewById(R.id.iv_team_image);
        indIV.setImageResource(R.drawable.indiana_pacers_logo);
        indIV.setOnClickListener(this);

        miaV=findViewById(R.id.include_miami_heat_team);
        miaTV=miaV.findViewById(R.id.tv_team_name);
        miaTV.setText(R.string.mia);
        miaIV=miaV.findViewById(R.id.iv_team_image);
        miaIV.setImageResource(R.drawable.miami_heat_logo);
        miaIV.setOnClickListener(this);

        milV=findViewById(R.id.include_milwaukee_bucks_team);
        milTV=milV.findViewById(R.id.tv_team_name);
        milTV.setText(R.string.mil);
        milIV=milV.findViewById(R.id.iv_team_image);
        milIV.setImageResource(R.drawable.milwaukee_bucks_logo);
        milIV.setOnClickListener(this);

        nykV=findViewById(R.id.include_new_york_knicks_team);
        nykTV=nykV.findViewById(R.id.tv_team_name);
        nykTV.setText(R.string.nyk);
        nykIV=nykV.findViewById(R.id.iv_team_image);
        nykIV.setImageResource(R.drawable.new_york_knicks_logo);
        nykIV.setOnClickListener(this);

        orlV=findViewById(R.id.include_orlando_magic_team);
        orlTV=orlV.findViewById(R.id.tv_team_name);
        orlTV.setText(R.string.orl);
        orlIV=orlV.findViewById(R.id.iv_team_image);
        orlIV.setImageResource(R.drawable.orlando_magic_logo);
        orlIV.setOnClickListener(this);

        phiV=findViewById(R.id.include_philadelphia_76ers_team);
        phiTV=phiV.findViewById(R.id.tv_team_name);
        phiTV.setText(R.string.phi);
        phiIV=phiV.findViewById(R.id.iv_team_image);
        phiIV.setImageResource(R.drawable.philadelphia_76ers_logo);
        phiIV.setOnClickListener(this);

        torV=findViewById(R.id.include_toronto_raptors_team);
        torTV=torV.findViewById(R.id.tv_team_name);
        torTV.setText(R.string.tor);
        torIV=torV.findViewById(R.id.iv_team_image);
        torIV.setImageResource(R.drawable.toronto_raptors_logo);
        torIV.setOnClickListener(this);

        wasV=findViewById(R.id.include_washington_wizards_team);
        wasTV=wasV.findViewById(R.id.tv_team_name);
        wasTV.setText(R.string.was);
        wasIV=wasV.findViewById(R.id.iv_team_image);
        wasIV.setImageResource(R.drawable.washington_wizards_logo);
        wasIV.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==atlIV) {
            getTeamPage(1);
        } else if (view==bosIV) {
            getTeamPage(2);
        } else if (view==bknIV) {
            getTeamPage(3);
        } else if (view==chaIV) {
            getTeamPage(4);
        } else if (view==chiIV) {
            getTeamPage(5);
        }else if (view==cleIV) {
            getTeamPage(6);
        }else if (view==detIV) {
            getTeamPage(9);
        }else if (view==indIV) {
            getTeamPage(12);
        }else if (view==miaIV) {
            getTeamPage(16);
        }else if (view==milIV) {
            getTeamPage(17);
        }else if (view==nykIV) {
            getTeamPage(20);
        }else if (view==orlIV) {
            getTeamPage(22);
        }else if (view==phiIV) {
            getTeamPage(23);
        }else if (view==torIV) {
            getTeamPage(28);
        }else if (view==wasIV) {
            getTeamPage(30);
        } else {
            getTeamPage(0);
        }
    }

    public void getTeamPage(int teamId){
        Intent tpi=new Intent(NBA_Activity.this,TeamActivity.class);
        tpi.putExtra("teamID",teamId);
        startActivity(tpi);
    }
}