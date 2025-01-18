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
        if (!insertScore(score)) this.scores.add(score);
    }

    private boolean insertScore(int score) {
        boolean hasShifted = false;
        int scoresSize = scores.size();
        for (int i = 0; i < scoresSize; i++) {
            if (score > scores.get(i)) {
                scores.add(i, score);
                hasShifted = true;
                break;
            }
        }

        return hasShifted;
    }

    public List<Integer> getScores() {
        return this.scores;
    }
}
