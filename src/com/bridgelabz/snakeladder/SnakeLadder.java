package com.bridgelabz.snakeladder;

public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	public static final int NO_PLAY = 0;

	public static int position = 0;
	public static int totalDiceRolls = 0; // UC6 - Number of times dice rolls
	public static int player = 2;

	public static void playerPositionMoves() {
		while (position < 100) {
			switchPlayer();
			final int DICE_START_RANGE = 1;
			final int DICE_END_RANGE = 6 - DICE_START_RANGE;

			System.out.println("<--------------------------------------------->");
			int diceNumber = (int) Math.floor(Math.random() * DICE_END_RANGE) + DICE_START_RANGE;
			System.out.println("Dice Number : " + diceNumber);

			int option = (int) Math.floor(Math.random() * 3);
			if (option == IS_SNAKE) {
				position -= diceNumber;
				System.out.println("Snake is bites....");
			} else if (option == IS_LADDER) {
				position += diceNumber;
				switchPlayer();
			} else if (option == NO_PLAY) {
				System.out.println("NO Play");
			}

			if (position < START_POSITION) { // UC4 - Player restarts from 0
				position = START_POSITION;
			} else if (position > 100) {
				position -= diceNumber;
			}
			totalDiceRolls++;
			System.out.println("Player moves position: " + position);
		}
	}

	public static void switchPlayer() {
		// UC7 - Game between two players
		if (player == 2) {
			player = 1;
		} else {
			player = 2;
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println("<--------------------------------------------->");
		playUntilWin();
		System.out.println("<--------------------------------------------->");
		System.out.println("Player" + player + " has won");
		System.out.println("Total dice roll: " + totalDiceRolls);
	}

	public static void playUntilWin() { // UC5 - Check position is 100 or not
		while (position != 100) {
			playerPositionMoves();
		}
	}
}