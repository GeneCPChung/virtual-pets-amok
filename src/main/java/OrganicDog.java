import java.util.Random;

public class OrganicDog extends DogParent implements OrganicInterface {
	Random rand = new Random();
	int rngDog1 = rand.nextInt(10) + 1;

	protected int cageStatus = 0;

	public OrganicDog(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth, int oilLube) {
		super(name, description, hunger, boredom, cageCleanliness, tiredness, thirst, totalHappiness, totalHealth,
				oilLube);
		this.oilLube = 0;
	}

	public OrganicDog(String name, String description) {
		super(name, description);
		this.oilLube = 0;
	}

	public int getCageStatus() {
		return cageStatus;
	}

	@Override
	public void feedPets() {
		int eating = rngDog1;
		hunger -= eating;
		cageCleanliness += eating;
	}

	@Override
	public void waterPets() {
		int watering = rngDog1;
		thirst -= watering;
	}

}
