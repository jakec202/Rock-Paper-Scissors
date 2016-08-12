package com.arena;

import java.util.Scanner;

public class Arena {
	String userName = null;
	String userCountry = null;
	String userFlag = null;
	String requestedOpponent = null;
	// boolean userFailed = false;
	// String validCountry = "IBC";
	static String userPlayAgain = null;
	// char [] valid = {'I','B','C'};

	public static void main(String[] args) {

		boolean isGood = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Rock, Paper, Scissor Olympics!" + "\nWhat is your name?");
		String userName = sc.nextLine();

		System.out.println("What country are you from?");
		String userCountry = sc.nextLine();

		System.out.println("What are the colors of your flag");
		String userFlag = sc.nextLine();

		do {
			do {
				isGood = false;
				System.out.println(
						"What country would you like to play? Press 'I' for Italy, 'B' for Brazil, or 'C' for Canada.");
				String requestedOpponent = sc.nextLine();

				{
					if (requestedOpponent.equalsIgnoreCase("I")) {
						System.out.println("Italy is up to the challenge, are you?");

					} else if (requestedOpponent.equalsIgnoreCase("B")) {
						System.out.println("Brazil is ready to battle!");

					} else if (requestedOpponent.equalsIgnoreCase("C")) {
						System.out.println("Canada wants to play hockey but will settle for Rock, Paper, Scissors.");

					} else {
						System.out.println("please enter a valid country");
						isGood = true;
					}
				}

			} while (isGood);

			RockPaperScissorsEvaluate userChoice = new RockPaperScissorsEvaluate();
			userChoice.userThrow();
			userChoice.opponentThrow();
			userChoice.compareThrows();
			System.out.println("Would you like to play again?");
			userPlayAgain = sc.nextLine();

		} while (userPlayAgain.equalsIgnoreCase("Y"));

		System.out.println(userName + " from " + userCountry + " exits the arena waving their countries " + userFlag + "flag");
		sc.close();
		System.exit(0);
	} // main

}// class
