package animals;

public class Articuno extends Pokemon {
	static int SHEER_COLD_PP = 8;
	public static int maxHP = 384;
	
	@Override
	public void animalSound() {
		System.out.println("Gyaoo!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Articuno is fast asleep!");
	}
	
	public static void sheerCold(int pp) {
		if (pp == SHEER_COLD_PP) {
			System.out.println("Articuno used Sheer Cold!\n"
					+ "The terminal took calamitous damage!");
			System.exit(0);
		} else if (pp == 0) {
			System.out.println("There is not enough PP to use the move!");
		} else if (pp > SHEER_COLD_PP) {
			System.out.println("PP over maximum value.");
		} else {
			System.out.println("Gotta restore its PP first!");
		}
	}
}
