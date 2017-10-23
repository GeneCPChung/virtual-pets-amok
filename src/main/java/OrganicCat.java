import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicInterface {
	Random rand = new Random();
	int rngCat1 = rand.nextInt(5) + 1;
	int rngCat2 = rand.nextInt(5) + 1;
	int rngCat3 = rand.nextInt(5) + 1;

	protected int thirst = rngCat1;
	protected int hunger = rngCat2;
	protected int litterBox;

	public OrganicCat(String name, String description, int hunger, int boredom, int tiredness, int thirst,
			int totalHappiness, int totalHealth, int litterBox) {
		super(name, description, boredom, tiredness, totalHappiness, totalHealth);
		this.litterBox = litterBox;
	}

	public OrganicCat(String name, String description) {
		super(name, description);
	}

	public int getHunger() {
		return hunger;
	}

	public int getlitterBox() {
		return litterBox;
	}

	public int getThirst() {
		return thirst;
	}

	public int calcCatHealth() {
		int catHealth = boredom + tiredness + hunger + boredom + thirst + litterBox;
		if (catHealth > 30) {
			totalHealth -= 5;
		}
		return catHealth;
	}

	public void calcCatHappiness() {

		if (calcCatHealth() <= 30) {
			totalHappiness += 5;
		}
		if (calcCatHealth() > 30) {
			totalHappiness -= 5;
		}
	}

	public int removeLitterBox() {
		litterBox = 0;
		return litterBox;
	}

	public int getCatTick() {
		int tickStat = (int) (Math.random() * 25) + 1;

		if (tickStat < 15) {
			litterBox += 3;
			thirst += rngNum2;
			hunger += rngNum4;

			return tickStat;
		}
		if (tickStat >= 15) {
			litterBox += 5;
			thirst += rngNum2;
			hunger += rngNum4;

			return tickStat;

		}

		else {
			return 0;
		}
	}

	@Override
	public void feedPets() {
		int eating = rngCat1;
		hunger -= eating;
		litterBox += eating;
	}

	@Override
	public void waterPets() {
		int drinking = rngCat1;
		thirst -= drinking;
		litterBox += drinking;
		if (thirst < 0) {
			thirst = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + hunger + "\t|" + thirst + "\t|" + "\t|";
	}

}
