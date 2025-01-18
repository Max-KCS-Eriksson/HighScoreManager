package com.maxeriksson.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.maxeriksson.domain.HighScoreManager;

import io.cucumber.java.en.*;

import java.util.Arrays;
import java.util.List;

public class AddScoreSteps {

    private Integer[] existingScores = {1000, 900, 800};
    private HighScoreManager highScoreManager;

    @Given("an existing High Score list")
    public void anExistingHighScoreList() {
        highScoreManager = new HighScoreManager(Arrays.asList(existingScores));
    }

    @When("adding the Score {int}")
    public void addingTheScore(Integer score) {
        highScoreManager.addScore(score);
    }

    @Then("the list should be updated in descending order")
    public void theListShouldBeUpdatedInDescendingOrder() {
        Integer[] expected = {1200, 1000, 900, 800};
        List<Integer> actual = highScoreManager.getScores();

        assertEquals(Arrays.asList(expected), actual);
    }
}
