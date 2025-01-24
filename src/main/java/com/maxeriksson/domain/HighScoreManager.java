package com.maxeriksson.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScoreManager {

    List<Integer> scores;

    public HighScoreManager() {
        this.scores = new ArrayList<>();
    }

    public HighScoreManager(List<Integer> scores) {
        this.scores = new ArrayList<>(scores);
        this.scores.sort(Collections.reverseOrder());
    }

    public void addScore(int score) {
        if (this.scores.size() == 0 || !insertScore(score)) this.scores.add(score);
    }

    private boolean insertScore(int score) {
        int index = findInsertPosition(score);

        boolean hasShifted = false;
        if (score >= scores.get(index)) {
            scores.add(index, score);
            hasShifted = true;
        }

        return hasShifted;
    }

    private int findInsertPosition(int score) {
        int start = 0;
        int end = scores.size() - 1;
        int middle = -1;

        while (start <= end) {
            middle = (start + end) / 2;

            int middleValue = scores.get(middle);
            if (middleValue == score) {
                return middle;
            }

            if (scores.get(middle) > score) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
    }

    public List<Integer> getScoresTop(int topNum) {
        List<Integer> scores = getScores();
        if (scores.size() < topNum) {
            return scores;
        }
        return scores.subList(0, topNum);
    }

    public List<Integer> getScores() {
        return this.scores;
    }
}
