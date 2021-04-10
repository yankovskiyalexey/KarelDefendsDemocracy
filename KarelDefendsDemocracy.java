package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				runcode();
			}

			else {
				move();
				move();
			}
		}
	}

	private void runcode() {

		turnLeft();
		move();
		if (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		move();
		if (beepersPresent()) {
			pickBeeper();
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
		move();
		if (frontIsClear()) {
			move();
		}

	}
}
