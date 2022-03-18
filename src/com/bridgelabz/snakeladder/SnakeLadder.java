package com.bridgelabz.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to the game of Snake and ladder \n");

		int position = 0;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		final int current_position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;
		int diceRollCount = 0;

		System.out.println(
				"Your current position is :" + position);

		while (position != 100) {
			diceRollCount++;
			int diceNumber = (int) Math
					.floor(Math.random() * DICE_END_RANGE)
					+ DICE_START_RANGE;
			int option = (int) Math
					.floor(Math.random() * 3);

			System.out.println(
					"You have got a Dice number of :"
							+ diceNumber);
			switch (option) {
			case NO_PLAY:
				position = position;

				System.out.println(
						"Sorry!!! You are on NO PLAY position. Your current position "
								+ position
								+ " Please wait for your next turn");
				break;
			case LADDER:
				position = position + diceNumber;
				System.out.println(
						"Hurray!!! It's a Ladder, you can move by "
								+ diceNumber
								+ " numbers to reach position :"
								+ position);
				if (position > 100) {
					position = position - diceNumber;
				}
				break;
			case SNAKE:
				position = position - diceNumber;
				System.out.println(
						"Oops!!! You are bit by a snake. You have to get back by "
								+ diceNumber
								+ " numbers to reach position :"
								+ position);
				if (position < 0) {
					position = position + diceNumber;
				}
				break;
			}	
		}
		
		System.out.println("Total number of times Dice rolled: "+diceRollCount);
		
		if (position == 100) {
			System.out.println(
					" Congratulations, you won!!!!! \n GAME OVER");
			System.out.println(
					"Thankyou for playing the Game!!! \n Have a nyc day");
		}
	}
}
