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

    ImageView dalIV, denIV, lacIV, lalIV, okcIV, nopIV, sasIV, gswIV, phoIV, porIV, sacIV, memIV, minIV, houIV, utaIV;
    TextView dalTV, denTV, lacTV, lalTV, okcTV, nopTV, sasTV, gswTV, phoTV, porTV, sacTV, memTV, minTV, houTV, utaTV;
    View dalV, denV, lacV, lalV, okcV, nopV, sasV, gswV, phoV, porV, sacV, memV, minV, houV, utaV;

    ImageView nbaIV, eastIV, westIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);

        nbaIV=findViewById(R.id.iv_nba_logo);
        nbaIV.setImageResource(R.drawable.nba_logo);

        eastIV=findViewById(R.id.include_east_conference);
        eastIV.setImageResource(R.drawable.nba_east_conference_logo);
        eastIV.setOnClickListener(this);

        westIV=findViewById(R.id.include_west_conference);
        westIV.setImageResource(R.drawable.nba_west_conference_logo);
        westIV.setOnClickListener(this);

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

        dalV=findViewById(R.id.include_dallas_mavericks_team);
        dalTV=dalV.findViewById(R.id.tv_team_name);
        dalTV.setText(R.string.dal);
        dalIV=dalV.findViewById(R.id.iv_team_image);
        dalIV.setImageResource(R.drawable.dallas_mavericks_logo);
        dalIV.setOnClickListener(this);

        denV=findViewById(R.id.include_denver_nuggets_team);
        denTV=denV.findViewById(R.id.tv_team_name);
        denTV.setText(R.string.den);
        denIV=denV.findViewById(R.id.iv_team_image);
        denIV.setImageResource(R.drawable.denver_nuggets_logo);
        denIV.setOnClickListener(this);

        lacV=findViewById(R.id.include_los_angeles_clippers_team);
        lacTV=lacV.findViewById(R.id.tv_team_name);
        lacTV.setText(R.string.lac);
        lacIV=lacV.findViewById(R.id.iv_team_image);
        lacIV.setImageResource(R.drawable.los_angeles_clippers_logo);
        lacIV.setOnClickListener(this);

        lalV=findViewById(R.id.include_los_angeles_lakers_team);
        lalTV=lalV.findViewById(R.id.tv_team_name);
        lalTV.setText(R.string.lal);
        lalIV=lalV.findViewById(R.id.iv_team_image);
        lalIV.setImageResource(R.drawable.los_angeles_lakers_logo);
        lalIV.setOnClickListener(this);

        okcV=findViewById(R.id.include_okc_thunder_team);
        okcTV=okcV.findViewById(R.id.tv_team_name);
        okcTV.setText(R.string.okc);
        okcIV=okcV.findViewById(R.id.iv_team_image);
        okcIV.setImageResource(R.drawable.oklahoma_city_thunder_logo);
        okcIV.setOnClickListener(this);

        nopV=findViewById(R.id.include_new_orleans_pelicans_team);
        nopTV=nopV.findViewById(R.id.tv_team_name);
        nopTV.setText(R.string.nop);
        nopIV=nopV.findViewById(R.id.iv_team_image);
        nopIV.setImageResource(R.drawable.new_orleans_pelicans_logo);
        nopIV.setOnClickListener(this);

        sasV=findViewById(R.id.include_san_antonio_spurs_team);
        sasTV=sasV.findViewById(R.id.tv_team_name);
        sasTV.setText(R.string.sas);
        sasIV=sasV.findViewById(R.id.iv_team_image);
        sasIV.setImageResource(R.drawable.san_antonio_spurs_logo);
        sasIV.setOnClickListener(this);

        gswV=findViewById(R.id.include_golden_state_warriors_team);
        gswTV=gswV.findViewById(R.id.tv_team_name);
        gswTV.setText(R.string.gsw);
        gswIV=gswV.findViewById(R.id.iv_team_image);
        gswIV.setImageResource(R.drawable.golden_state_warriors_logo);
        gswIV.setOnClickListener(this);

        phoV=findViewById(R.id.include_phoenix_suns_team);
        phoTV=phoV.findViewById(R.id.tv_team_name);
        phoTV.setText(R.string.pho);
        phoIV=phoV.findViewById(R.id.iv_team_image);
        phoIV.setImageResource(R.drawable.phoenix_suns_logo);
        phoIV.setOnClickListener(this);

        porV=findViewById(R.id.include_portland_trail_blazers_team);
        porTV=porV.findViewById(R.id.tv_team_name);
        porTV.setText(R.string.por);
        porIV=porV.findViewById(R.id.iv_team_image);
        porIV.setImageResource(R.drawable.portland_trail_blazers_logo);
        porIV.setOnClickListener(this);

        sacV=findViewById(R.id.include_sacramento_kings_team);
        sacTV=sacV.findViewById(R.id.tv_team_name);
        sacTV.setText(R.string.sac);
        sacIV=sacV.findViewById(R.id.iv_team_image);
        sacIV.setImageResource(R.drawable.sacramento_kings_logo);
        sacIV.setOnClickListener(this);

        memV=findViewById(R.id.include_memphis_grizzlies_team);
        memTV=memV.findViewById(R.id.tv_team_name);
        memTV.setText(R.string.mem);
        memIV=memV.findViewById(R.id.iv_team_image);
        memIV.setImageResource(R.drawable.memphis_grizzlies_logo);
        memIV.setOnClickListener(this);

        minV=findViewById(R.id.include_minnesota_timberwolves_team);
        minTV=minV.findViewById(R.id.tv_team_name);
        minTV.setText(R.string.min);
        minIV=minV.findViewById(R.id.iv_team_image);
        minIV.setImageResource(R.drawable.minnesota_timberwolves_logo);
        minIV.setOnClickListener(this);

        houV=findViewById(R.id.include_houston_rockets_team);
        houTV=houV.findViewById(R.id.tv_team_name);
        houTV.setText(R.string.hou);
        houIV=houV.findViewById(R.id.iv_team_image);
        houIV.setImageResource(R.drawable.houston_rockets_logo);
        houIV.setOnClickListener(this);

        utaV=findViewById(R.id.include_utah_jazz_team);
        utaTV=utaV.findViewById(R.id.tv_team_name);
        utaTV.setText(R.string.uta);
        utaIV=utaV.findViewById(R.id.iv_team_image);
        utaIV.setImageResource(R.drawable.utah_jazz_logo);
        utaIV.setOnClickListener(this);

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
        }else if (view==dalIV) {
            getTeamPage(7);
        }else if (view==denIV) {
            getTeamPage(8);
        }else if (view==detIV) {
            getTeamPage(9);
        }else if (view==gswIV) {
            getTeamPage(10);
        }else if (view==houIV) {
            getTeamPage(11);
        }else if (view==indIV) {
            getTeamPage(12);
        }else if (view==lacIV) {
            getTeamPage(13);
        }else if (view==lalIV) {
            getTeamPage(14);
        }else if (view==memIV) {
            getTeamPage(15);
        }else if (view==miaIV) {
            getTeamPage(16);
        }else if (view==milIV) {
            getTeamPage(17);
        }else if (view==minIV) {
            getTeamPage(18);
        }else if (view==nopIV) {
            getTeamPage(19);
        }else if (view==nykIV) {
            getTeamPage(20);
        }else if (view==okcIV) {
            getTeamPage(21);
        }else if (view==orlIV) {
            getTeamPage(22);
        }else if (view==phiIV) {
            getTeamPage(23);
        }else if (view==phoIV) {
            getTeamPage(24);
        }else if (view==porIV) {
            getTeamPage(25);
        }else if (view==sacIV) {
            getTeamPage(26);
        }else if (view==sasIV) {
            getTeamPage(27);
        }else if (view==torIV) {
            getTeamPage(28);
        }else if (view==utaIV) {
            getTeamPage(29);
        }else if (view==wasIV) {
            getTeamPage(30);
        }else if (view==eastIV) {
            getTeamPage(31);
        }else if (view==westIV) {
            getTeamPage(32);
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