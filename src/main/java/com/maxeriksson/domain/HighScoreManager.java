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
        boolean hasShifted = false;
        int scoresSize = scores.size();
        for (int i = 0; i < scoresSize; i++) {
            if (score > scores.get(i)) {
                scores.add(i, score);
                hasShifted = true;
                break;
            }
        }

        if (!hasShifted) this.scores.add(score);
    }

    public List<Integer> getScores() {
        return this.scores;
    }
}
