package com.maxeriksson;

import com.maxeriksson.domain.HighScoreManager;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static HighScoreManager highScoreManager;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        highScoreManager = new HighScoreManager();

        boolean isRunning = true;
        while (isRunning) {
            String[] menuChoices = {"Add new Score", "List top Scores", "Exit"};
            for (int i = 0; i < menuChoices.length; i++) {
                System.out.println((i + 1) + ") " + menuChoices[i]);
            }

            System.out.print("Choice > ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Score > ");
                    highScoreManager.addScore(input.nextInt());
                    input.nextLine();
                }
                case 2 -> {
                    int numOfTopScores = 3;
                    System.out.println(highScoreManager.getScoresTop(numOfTopScores));
                }
                case 3 -> isRunning = false;
                default -> System.out.println("Invalid choice - try again");
            }
        }
    }
}
