Feature:
  As a player
  I want to add my Score to the High Score list
  So that I can compare my result

  Scenario: When adding a new score, it should appear in the leaderboard if it's high enough.
    Given an existing High Score list
    When adding the Score 1200
    Then the list should be updated in descending order
