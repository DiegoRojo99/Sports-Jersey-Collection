package com.youngdred.sports_jersey_collection.items;

import android.media.Image;

import java.util.ArrayList;

public class Jersey {

    public Team team;
    public int jerseyId;
    public String color;
    public int year;
    public String sport;
    public String edition;
    public String image;

    public Jersey(Team team, int jerseyId, String color, int year, String sport, String edition, String image) {
        this.team = team;
        this.jerseyId = jerseyId;
        this.color = color;
        this.year = year;
        this.sport = sport;
        this.edition=edition;
        this.image=image;
    }
}
