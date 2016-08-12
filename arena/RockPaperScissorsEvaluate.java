package com.arena;
import java.util.Random;
public class RockPaperScissorsEvaluate extends RockPaperScissorsUserMath {
	
	Random rand = new Random();
	int rollValue = rand.nextInt(3) + 1;
	public void opponentThrow() {

		
		// computer roll
		// System.out.println(rollValue);
		if (rollValue > 1 && rollValue < 3) {
			System.out.println("The 'opponent' rolled paper!");

		} else if (rollValue > 0 && rollValue < 2) {
			System.out.println("The 'opponent' rolled rock!");

		} else if (rollValue > 2 && rollValue < 4) {
			System.out.println("The 'opponent' rolled scissors!");

		}
	}
	public void compareThrows(){
	

if ((rollValue == 1) && ((userValue == 1))) {
    System.out.println("YOU TIE!");
} else if ((rollValue == 1) && ((userValue == 2))) {
    System.out.println("YOU WIN!");
} else if ((rollValue == 1) && ((userValue == 3))) {
    System.out.println("YOU LOSE!");
} else if ((rollValue == 2) && ((userValue == 1))) {
    System.out.println("YOU WIN!");
} else if ((rollValue == 2) && ((userValue == 2))) {
    System.out.println("YOU TIE!");
} else if ((rollValue == 2) && ((userValue == 3))) {
    System.out.println("YOU LOSE?");
} else if ((rollValue == 3) && ((userValue == 1))) {
    System.out.println("YOU WIN!");
} else if ((rollValue == 3) && ((userValue == 2))) {
    System.out.println("YOU LOSE!");
} else if ((rollValue == 3) && ((userValue == 3))) {
    System.out.println("YOU TIE!");
}
System.out.println(" ");
}
}