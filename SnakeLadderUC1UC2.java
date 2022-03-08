package com.bl.SnakeAndLadder;

public class SnakeLadderUC1UC2 {
	
	public static void main(String[] args) {
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6; 
		int diceNumber = (int)Math.floor(Math.random()*DICE_END_RANGE+DICE_START_RANGE);
		System.out.println("The casted value is: " + diceNumber);
    }
}


