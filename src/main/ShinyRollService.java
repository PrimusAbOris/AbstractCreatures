package main;

import java.util.Random;

public class ShinyRollService {
	
	public boolean rollShiny (int shinyMod) {
		Random passageOfFate = new Random();
		int roll = passageOfFate.nextInt(4096);
		// System.out.println("roll: " + roll);
		if (roll == 4095) {
			System.out.println("Whoa! It's a full odds shiny!");
			return true;
		} else if (roll + shinyMod >= 4096) {
			System.out.println("Whoa! It's a shiny!");
			return true;
		} else {
			return false;
		}
	}
	
}
