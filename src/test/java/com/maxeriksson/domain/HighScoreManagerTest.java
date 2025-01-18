package com.maxeriksson.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HighScoreManagerTest {

    private Integer[] existingScores = {1000, 800};
    private HighScoreManager highScoreManager;

    @BeforeEach
    void setUp() {
        highScoreManager = new HighScoreManager(Arrays.asList(existingScores));
    }

    @Test
    void instertScoreAtPositionInDescendingOrder() {
        highScoreManager.addScore(900);
        Integer[] expected = {1000, 900, 800};

        assertEquals(Arrays.asList(expected), highScoreManager.getScores());
    }

    @Test
    void totalScoresIncreaseWhenAddingScore() {
        highScoreManager.addScore(1200);

        assertEquals(existingScores.length + 1, highScoreManager.getScores().size());
    }
}
