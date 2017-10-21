import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicInterface {
	Random rand = new Random();
	int rngCat1 = rand.nextInt(10) + 1;

	public OrganicCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
		this.hunger = 0;
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

	@Override
	public String toString() {
		return "" + this.name + this.description + "\t|" + this.totalHappiness + "\t|" + this.totalHealth + "\t|"
				+ this.hunger + "\t|" + this.boredom + "\t|" + this.needToPotty + "\t|" + this.tiredness + "\t|"
				+ this.thirst;
	}

}
