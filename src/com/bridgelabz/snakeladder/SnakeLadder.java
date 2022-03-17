package com.bridgelabz.snakeladder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SnakeLadder {

	public static void main(String[] args) {
		int player1Position = 0;
		int player2Position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;
		final int NO_PLAY = 0;
		final int SNAKE = 2;
		final int LADDER = 1;

		int rollDieCount = 0;

		PrintWriter writer = null;
		try {
			writer = new PrintWriter("snakeladder.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.println(
				"Welcome to Snake and Ladder game!!!!");
		String currentPlayer = "P1";
		while (player1Position != 100
				&& player2Position != 100) {
			rollDieCount++;
			writer.println("Player1 Pos : "
					+ player1Position + "\tPlayer2 Pos : "
					+ player2Position);
			int diceNumber = (int) Math
					.floor(Math.random() * DICE_END_RANGE)
					+ DICE_START_RANGE;

			int option = (int) Math
					.floor(Math.random() * 3);
			int playerPosition;

			if (currentPlayer.equals("P1")) {
				playerPosition = player1Position;
			} else {
				playerPosition = player2Position;
			}
			writer.println("------------" + currentPlayer
					+ " turn--------------");
			writer.println("Die Number : " + diceNumber);
			switch (option) {
			case NO_PLAY:
				writer.println("No Play Option => "
						+ currentPlayer + " Position : "
						+ playerPosition);
				break;

			case LADDER:
				playerPosition = playerPosition
						+ diceNumber;
				if (playerPosition > 100) {
					playerPosition = playerPosition
							- diceNumber;
				}
				writer.println("Ladder Option => "
						+ currentPlayer + " Position : "
						+ playerPosition);
				break;

			case SNAKE:
				playerPosition = playerPosition
						- diceNumber;
				if (playerPosition < 0) {
					playerPosition = 0;
				}
				writer.println("Snake Option => "
						+ currentPlayer + " Position : "
						+ playerPosition);
				break;
			}
			if (currentPlayer.equals("P1")) {
				player1Position = playerPosition;
			} else {
				player2Position = playerPosition;
			}
			currentPlayer = option == LADDER ? currentPlayer
					: currentPlayer.equals("P1") ? "P2"
							: "P1";
		}

		writer.println(
				"Number of Rolling : " + rollDieCount);
		if (player1Position == 100) {
			writer.println("Player 1 won");
		} else {
			writer.println("Player 2 won");
		}
		writer.println("Player1 Pos : " + player1Position
				+ "\tPlayer2 Pos : " + player2Position);
		System.out.println("Game Over!!!");
		writer.close();
	}

}