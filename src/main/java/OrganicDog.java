import java.util.Random;

public class OrganicDog extends DogParent implements OrganicInterface {
	Random rand = new Random();
	int rngDog1 = rand.nextInt(10) + 1;

	protected int thirst = rngNum5;
	protected int hunger = rngDog1;
	protected int cageCleanliness = 0;

	public OrganicDog(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description);
	}

	public OrganicDog(String name, String description) {
		super(name, description);
		this.oilLube = 0;
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public int getHunger() {
		return hunger;
	}

	@Override
	public void feedPets() {
		int eating = rngDog1;
		hunger -= eating;
		cageCleanliness += eating;
	}

	@Override
	public void waterPets() {
		int drinking = rngDog1;
		thirst -= drinking;
	}

	@Override
	public void takeAWalk() {
		cageCleanliness = 0;
	}

	@Override
	public String toString() {
		return super.toString() + hunger + "\t|" + thirst + "\t|" + cageCleanliness;
	}

}
