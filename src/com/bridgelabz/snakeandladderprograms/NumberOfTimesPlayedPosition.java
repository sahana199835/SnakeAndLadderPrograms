package com.bridgelabz.snakeandladderprograms;

public class NumberOfTimesPlayedPosition {

	public static final int START_POSITION = 0;
	public static final int WINNING_POSITION = 100;
	public static int currentPosition;
	public static void main(String[] args) {
		currentPosition = START_POSITION;
		NumberOfTimesPlayedPosition snakeAndLadderProgram = new NumberOfTimesPlayedPosition();
		snakeAndLadderProgram.diceRolls();

	}

	public void diceRolls() {
		int rollingDice = 0;
		while (currentPosition < WINNING_POSITION) {

			int dieRoll = (int) Math.floor(Math.random() * 6) + 1; // roll the die and get a number between 1 and 6
			int option = (int) Math.floor(Math.random() * 3); // get a random number between 0 and 2 to determine the
			int option1 = (int) Math.floor(Math.random() * 3); // get a random number between 0 and 2 to determine the //
																// option
			rollingDice++;

			switch (option) {
			case 0: // No Play
@@ -43,5 +46,6 @@ public void diceRolls1() {

		}
		System.out.println(CurrentPosition);
		System.out.println("After rolling the dice: " + rollingDice);
	
}

		
		
