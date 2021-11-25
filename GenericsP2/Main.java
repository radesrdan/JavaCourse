package com.udemy.GenericsP2;

public class Main {

    public static void main(String[] args) {
        FootballPlayer rade = new FootballPlayer("Rade");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer joe = new SoccerPlayer("Joe");

        Team<FootballPlayer> leadingCows = new Team<>("Leading Crows");
        Team<SoccerPlayer> inter  = new Team<>("Inter");
        Team<SoccerPlayer> milan  = new Team<>("Milan");
//        leadingCows.addPlayer(joe);
//        leadingCows.addPlayer(pat);
        leadingCows.addPlayer(rade);

        System.out.println(leadingCows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Raiders");
        baseballTeam.addPlayer(pat);

        inter.matchResult(milan,2,1);
        inter.matchResult(milan,2,4);
        milan.matchResult(inter,1,1);
        milan.matchResult(inter,3,1);

        System.out.println("===Rankings===");
        System.out.println(milan.getTeamName() + " : " + milan.ranking());
        System.out.println(inter.getTeamName() + " : " + inter.ranking());

        System.out.println(inter.compareTo(milan));
        System.out.println(milan.compareTo(inter));




    }
}
