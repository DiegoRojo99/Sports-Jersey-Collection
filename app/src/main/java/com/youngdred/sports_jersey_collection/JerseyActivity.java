package com.youngdred.sports_jersey_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.youngdred.sports_jersey_collection.items.Team;

public class JerseyActivity extends AppCompatActivity {

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
    }
}