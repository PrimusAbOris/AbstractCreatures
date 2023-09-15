package animals;

import java.util.Random;

public class Dondozo extends Pokemon {
	public static int maxHP = 504;
	Random passageOfFate = new Random();

	public Dondozo (String in) {
		int roll = passageOfFate.nextInt(4096);
		int shinyMod = 1;
		// shinyMod = 5000;
		if (in.equals("shiny")) {
			shiny = true;
			System.out.println("Whoa! It's a shiny Dondozo!");
		} else if ((roll + shinyMod) >= 4096) {
			shiny = true;
			System.out.println("Whoa! It's a full odds shiny Dondozo!");
		}
		// for now, only Dondozo can be shiny
	}
	
	public Dondozo (String in, int shinyMod) {
		int roll = passageOfFate.nextInt(4096);
		if (in.equals("shiny") || (roll + shinyMod) >= 4096) {
			shiny = true;
			System.out.println("Whoa! It's a shiny Dondozo!");
		}
	}
	
	@Override
	public void animalSound() {
		System.out.println("Dondozo raises its head above the water and roars!");
	}

}
