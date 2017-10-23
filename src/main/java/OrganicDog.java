import java.util.Random;

public class OrganicDog extends DogParent implements OrganicInterface {
	Random rand = new Random();
	int rngDog1 = rand.nextInt(5) + 1;
	int rngDog2 = rand.nextInt(5) + 1;
	int rngDog3 = rand.nextInt(5) + 1;

	protected int thirst = rngDog1;
	protected int hunger = rngDog2;
	protected int cageCleanliness = 5;

	public OrganicDog(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description);
	}

	public OrganicDog(String name, String description) {
		super(name, description);
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int calcDogHealth() {
		int dogHealth = boredom + tiredness + hunger + boredom + thirst;
		if (dogHealth > 30) {
			totalHealth -= 5;
		}
		return dogHealth;
	}

	public void calcDogHappiness() {
		if (calcDogHealth() <= 30) {
			totalHappiness += 5;
		}
		if (calcDogHealth() > 30) {
			totalHappiness -= 5;
		}
	}

	public int getDogTick() {

		int tickStat = rngAct;
		if (tickStat < 15) {
			cageCleanliness += rngNum1;
			thirst += rngNum2;
			hunger += rngNum4;

			return tickStat;
		}
		if (tickStat >= 15) {
			cageCleanliness += rngNum1;
			thirst += rngNum2;
			hunger += rngNum4;

			return tickStat;
		} else {
			return 0;
		}
	}

	@Override
	public void feedPets() {
		int eating = rngDog1;
		hunger -= eating;
		thirst += eating;
		if (hunger < 0) {
			hunger = 0;
		}
	}

	@Override
	public void waterPets() {
		int drinking = rngDog1;
		thirst -= drinking;
		cageCleanliness += drinking;
		if (thirst < 0) {
			thirst = 0;
		}
	}

	@Override
	public void takeAWalk() {
		super.takeAWalk();
		cageCleanliness = getCageCleanliness() / 2;
	}

	@Override
	public String toString() {
		return super.toString() + hunger + "\t|" + thirst + "\t|" + cageCleanliness + "\t|";
	}

}
