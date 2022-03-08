package com.bl.SnakeAndLadder;

public class SnakeAndLadderUC4_7 {
	
	final int START_RANGE = 1;
	final int END_RANGE = 6;
	int dice = 0;
	int option;
	int player_position=0;
	int count = 0;
	int player1 = 1;
	int player2 = 2;
	int current_Player = player1;
	
	public void playerPosition(){
		while(player_position < 100) {
			final int DICE_START_RANGE = 1;
			final int DICE_END_RANGE = 6 - DICE_START_RANGE;
			final int START = 0;
			option = (int)(Math.random()*3);
			dice = (int) Math.floor(Math.random() * DICE_END_RANGE) + DICE_START_RANGE;
			playerCheck(option); //checking the player UC7
			System.out.println("Casted number is :" + dice);
			if(option==0) {						
				System.out.println("No play");
			}else if(option==1) {
				System.out.println("Player moves on Ladder ");
				player_position += dice;
			}else if(option==2) {
				System.out.println("Snake bites the player");
					player_position -= dice;
				}
			if(player_position<START) {	//UC 5
				player_position = 0;
			}
			if(player_position > 100) {
				player_position-=dice;
			}
				System.out.println("current position is " +player_position + "  by player  " + current_Player);//UC 6
				count++;//UC 6
				System.out.println();
		}
		System.out.println("Winner is Player number :" + current_Player); 
		System.out.println("Total times the dice was casted is " + count);
		
	}
	
	public void playerCheck(int option) {	//UC 7
		if(option ==0 || option == 2) {
			if(current_Player == player1) {
				current_Player = player2;
			}else if(current_Player == player2) {
				current_Player = player1;
			}
		}	
		else if(option == 1) {
			if(current_Player == player1) {
				current_Player = player1;
			}else if(current_Player == player2) {
				current_Player = player2;
			}
		}
	}
		
	
	public static void main(String[] args) {
		SnakeAndLadderUC4_7 number = new SnakeAndLadderUC4_7();
		number.playerPosition();
	}
}


