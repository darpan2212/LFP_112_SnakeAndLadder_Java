package com.bridgelabz.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		int position = 0;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		final int current_position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;

		int diceNumber = (int) Math
				.floor(Math.random() * DICE_END_RANGE)
				+ DICE_START_RANGE;
		int option = (int) Math.floor(Math.random() * 3);

		System.out.println(
				"Welcome to the game of Snake and ladder");
		System.out.println("You have got a Dice number of :"
					+ diceNumber);
		System.out.println("Your current position is :"
					+ position);

		switch (option) {
			case NO_PLAY:
				System.out.println(
						"Sorry!!! You are on NO PLAY position.  Your current position "
								+ diceNumber
								+ " is  Please wait for your next turn");
				position = position;

				break;
			case LADDER:
				position = position + diceNumber;
				System.out.println(
						"Hurray!!! It's a Ladder, you can move by "
								+ diceNumber
								+ " numbers to reach position :"
								+ position);
				break;
			case SNAKE:
				System.out.println(
						"Oops!!! You are bit by a snake. You have to get back by "
								+ diceNumber
								+ " numbers to reach position :"
								+ position);
				position = position - diceNumber;
				if (position < 0) {
					position = position + diceNumber;
				}
			}
			diceNumber++;
		}
	}