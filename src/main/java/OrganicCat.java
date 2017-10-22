import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicInterface {
	Random rand = new Random();
	int rngCat1 = rand.nextInt(10) + 1;

	protected int thirst = rngNum5;
	protected int hunger = rngNum1;
	int litterBox = 0;

	public OrganicCat(String name, String description, int hunger, int boredom, int tiredness, int thirst,
			int totalHappiness, int totalHealth) {
		super(name, description, boredom, tiredness, totalHappiness, totalHealth);
	}

	public OrganicCat(String name, String description) {
		super(name, description);
		this.oilLube = 0;
	}

	public int getLitterBox() {
		return litterBox;
	}

	public void cleanLitterBox() {
		litterBox = 0;
	}

	@Override
	public void feedPets() {
		int eating = rngCat1;
		hunger -= eating;
	}

	@Override
	public void waterPets() {
		int drinking = rngCat1;
		thirst -= drinking;
	}

	@Override
	public String toString() {
		return super.toString() + hunger + "\t|" + thirst + "\t|" + "\t|" + litterBox;
	}

}
