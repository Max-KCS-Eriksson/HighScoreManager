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

    public List<Integer> getScoresTop(int topNum) {
        return this.scores.subList(0, topNum);
    }
}
