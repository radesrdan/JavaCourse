package com.udemy.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISavable {

    private String playerName;
    private int level;
    private String weapon;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Players(String playerName, int level, String weapon) {
        this.playerName = playerName;
        this.level = level;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "playerName='" + playerName +
                ", level=" + level +
                ", weapon='" + weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.playerName);
        values.add(1, "" + this.level);
        values.add(2, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.playerName = savedValues.get(0);
            this.level = Integer.parseInt(savedValues.get(1));
            this.weapon = savedValues.get(2);
        }


    }
}
