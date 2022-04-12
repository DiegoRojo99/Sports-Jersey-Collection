package com.youngdred.sports_jersey_collection.items;

import android.media.Image;

import java.util.ArrayList;

public class Jersey {

    Team team;
    String jerseyId;
    String color;
    int year;
    String sport;
    Image picture;

    public Jersey(Team team, String jerseyId, String color, int year, String sport, Image pic) {
        this.team = team;
        this.jerseyId = jerseyId;
        this.color = color;
        this.year = year;
        this.sport = sport;
        this.picture=pic;
    }

    public static ArrayList<Jersey> createJerseysList(int numJerseys, Team t) {
        ArrayList<Jersey> jerseys = new ArrayList<>();

        for (int i = 1; i <= numJerseys; i++) {
            jerseys.add(i,new Jersey(t, String.valueOf(i), null, 2022, null, null));
        }

        return jerseys;
    }
}
