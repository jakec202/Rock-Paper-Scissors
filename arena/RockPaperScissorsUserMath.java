package com.arena;

import java.util.Scanner;

public class RockPaperScissorsUserMath {

	Scanner scan = new Scanner(System.in);
	public String userThrow = null;
	public String userStart = null;
	public int userValue = 0;
	public String userPlayAgain = null;
	boolean validEntry = false;

	public void userThrow() {

		do {
			validEntry = false;
			System.out.println(("Input R, P or S to chose your throw!"));

			userThrow = scan.nextLine();

			if (userThrow.equalsIgnoreCase("R")) {
				System.out.print("You rolled rock!");
				userValue = 1;

			} else if (userThrow.equalsIgnoreCase("P")) {
				userValue = 2;
				System.out.print("You rolled paper!");

			} else if (userThrow.equalsIgnoreCase("S")) {
				userValue = 3;
				System.out.print("You rolled scissors!");

			} else {
				System.out.println("please enter a valid throw");
				validEntry = true;
			}

		} while (validEntry);

	//	scan.close();
	}
}
