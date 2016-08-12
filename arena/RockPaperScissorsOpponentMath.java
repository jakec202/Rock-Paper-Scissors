package com.arena;

import java.util.Random;

public class RockPaperScissorsOpponentMath extends RockPaperScissorsUserMath {

	public void opponentThrow() {

		Random rand = new Random();
		int rollValue = rand.nextInt(3) + 1;
		// computer roll
		// System.out.println(rollValue);
	
	}
}
