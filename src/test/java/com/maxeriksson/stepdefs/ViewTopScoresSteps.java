package com.maxeriksson.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.maxeriksson.domain.HighScoreManager;

import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewTopScoresSteps {

    private List<Integer> scores;
    private List<Integer> topScores;
    private HighScoreManager highScoreManager;

    @Given("a list containing multiple scores")
    public void aListContainingMultipleScores() {
        scores = new ArrayList<>(Arrays.asList(300, 1000, 700, 1, 50, 100));
        highScoreManager = new HighScoreManager(scores);
    }

    @When("requesting top {int}")
    public void requestingTop(int topNum) {
        topScores = highScoreManager.getScoresTop(topNum);
    }

    @Then("the displayed list shouldn't be shorter or longer than {int} scores")
    public void theDisplayedListShouldnTBeShorterOrLongerThan(int size) {
        assertEquals(size, topScores.size());
    }

    @Then("the scores are displayed in descending order, starting from the highest score")
    public void theScoresAreDisplayedInDescendingOrderStartingFromTheHighestScore() {
        List<Integer> expected = Arrays.asList(1000, 700, 300);

        assertEquals(expected, topScores);
    }
}
