import java.util.Random;

public class OrganicDog extends DogParent implements OrganicInterface {
	Random rand = new Random();
	int rngDog1 = rand.nextInt(10) + 1;

	public OrganicDog(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
	}

	protected int cageStatus = 0;

	public OrganicDog(String name, String description) {
		super(name, description);
	}

	@Override
	public void feedPets() {
		int eating = rngDog1;
		hunger -= eating;
		needToPotty += eating;
	}

	@Override
	public void waterPets() {
	}

	public int getCageStatus() {
		return cageStatus;
	}

}
