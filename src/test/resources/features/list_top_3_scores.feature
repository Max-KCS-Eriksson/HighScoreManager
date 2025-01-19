Feature:
  As a player
  I want to view the high score leaderboard
  So that I can see the top 3 scores

  Scenario: When viewing the top scores, they should be listed in descending order.
    Given a list containing multiple scores
    When requesting top 3
    Then the displayed list shouldn't be shorter or longer than 3 scores
    Then the scores are displayed in descending order, starting from the highest score
