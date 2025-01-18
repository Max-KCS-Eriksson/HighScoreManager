package com.maxeriksson.domain;

import java.util.ArrayList;
import java.util.List;

public class HighScoreManager {

    List<Integer> scores;

    public HighScoreManager() {
        this.scores = new ArrayList<>();
    }

    public HighScoreManager(List<Integer> scores) {
        this.scores = new ArrayList<>(scores);
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public List<Integer> getScores() {
        return this.scores;
    }
}
