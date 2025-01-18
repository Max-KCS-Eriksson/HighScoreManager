package com.maxeriksson.domain;

import java.util.ArrayList;
import java.util.List;

public class HighScoreManager {

    List<Integer> scores;

    public HighScoreManager() {
        this.scores = new ArrayList<>();
    }

    public HighScoreManager(List<Integer> scores) {
        this.scores = scores;
    }

    public void addScore(int score) {}

    public List<Integer> getScores() {
        return this.scores;
    }
}
