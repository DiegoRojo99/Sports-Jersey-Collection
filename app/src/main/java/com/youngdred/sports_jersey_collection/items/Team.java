package com.youngdred.sports_jersey_collection.items;

public class Team {

    public String name;
    public String country;
    public String league;


    public int teamID;

    public Team(String name, String country, String league, int teamID) {
        this.name = name;
        this.country = country;
        this.league = league;
        this.teamID=teamID;
    }
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", league='" + league + '\'' +
                ", teamID=" + teamID +
                '}';
    }
}
