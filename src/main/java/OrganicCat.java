import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicInterface {
	Random rand = new Random();
	int rngCat1 = rand.nextInt(10) + 1;

	public OrganicCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
	}

	public OrganicCat(String name, String description) {
		super(name, description);
	}

	@Override
	public void feedPets() {
		int eating = rngCat1;
		hunger -= eating;
		needToPotty += eating;
	}

	@Override
	public void waterPets() {
	}

}
