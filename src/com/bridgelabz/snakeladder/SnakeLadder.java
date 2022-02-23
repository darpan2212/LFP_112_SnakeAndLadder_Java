package com.bridgelabz.snakeladder;

public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Game");
		int position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;

		int diceNumber = (int) Math.floor(Math.random() * DICE_END_RANGE) + DICE_START_RANGE;
		System.out.println("<--------------------------------------------->");
		System.out.println("Dice Number : " + diceNumber);
		int option = (int) Math.floor(Math.random() * 3);
		System.out.println("<--------------------------------------------->");
		if (option == IS_SNAKE) {
			position -= diceNumber;
			// UC-4
			if (position < 0) {
				position = START_POSITION;
			}
			System.out.println("Player in snake position : " + position);
		} else if (option == IS_LADDER) {
			position += diceNumber;
			System.out.println("Player in ladder position : " + position);
		} else {
			System.out.println("No Play " + position);
		}
	}

}