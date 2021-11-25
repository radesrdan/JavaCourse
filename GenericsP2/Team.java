package com.udemy.GenericsP2;

import java.lang.reflect.Array;
import java.util.ArrayList;
// by adding Player into the diamons, we ensure that the type pamater has to be one of the classes that extends player
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String teamName;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("Player " + player.getName() + " is already on the team.");
            return false;
        } else {
            System.out.println("Player " + player.getName() + " added to the team.");
            members.add(player);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won ++;
            System.out.println("Your team has won!");
        }else if (theirScore == ourScore) {
            tied ++;
            System.out.println("The game is tied!");
        } else {
            lost++;
            System.out.println("Your team has lost!");
        }
        played ++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore,ourScore);
        }

    }

    public int ranking() {
        return (int) ((won * 1.85) + tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return  -1;
        }else if (this.ranking()<team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
