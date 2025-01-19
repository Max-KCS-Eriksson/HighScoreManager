package com.maxeriksson.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighScoreManagerTest {

    private HighScoreManager highScoreManager;

    @BeforeEach
    void setUp() {
        highScoreManager = new HighScoreManager(Arrays.asList(1000, 400, 600, 800, 200));
    }

    @Test
    void requestTopThreeScoresInDescendingOrder() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1000, 800, 600));

        assertEquals(expected, highScoreManager.getScoresTop(3));
    }

    @Test
    void topThreeScoresSize() {
        int expected = 3;

        assertEquals(expected, highScoreManager.getScoresTop(3).size());
    }
}
