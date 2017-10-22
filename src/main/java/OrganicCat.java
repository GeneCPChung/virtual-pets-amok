import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicInterface {
	Random rand = new Random();
	int rngCat1 = rand.nextInt(10) + 1;

	public OrganicCat(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth, int oilLube) {
		super(name, description, hunger, boredom, cageCleanliness, tiredness, thirst, totalHappiness, totalHealth,
				oilLube);
		this.oilLube = 0;
	}

	public OrganicCat(String name, String description) {
		super(name, description);
		this.oilLube = 0;
	}

	@Override
	public void feedPets() {
		int eating = rngCat1;
		hunger -= eating;
		cageCleanliness += eating;
	}

	@Override
	public void waterPets() {
	}

}
