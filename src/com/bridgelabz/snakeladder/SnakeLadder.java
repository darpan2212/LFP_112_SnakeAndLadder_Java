package com.bridgelabz.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
	    int position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;

		int diceNumber = (int) Math.floor(Math.random() * DICE_END_RANGE) + DICE_START_RANGE;
		int option = (int) Math.floor(Math.random() *3); 
		if (option == 0) {
			System.out.println("Player position is: " + position);
		}
		System.out.println(diceNumber);
	}

}