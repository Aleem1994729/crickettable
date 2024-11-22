package com.cricket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cricket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerNumber;

    private int strikeRate;
    private int centuries;
    private int halfCenturies;
    private int matches;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    public int getCenturies() {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public int getHalfCenturies() {
        return halfCenturies;
    }

    public void setHalfCenturies(int halfCenturies) {
        this.halfCenturies = halfCenturies;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }
}
