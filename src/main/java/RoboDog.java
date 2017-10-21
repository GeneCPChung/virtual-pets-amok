import java.util.Random;

public class RoboDog extends DogParent implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;
	int rngRobo2 = rand.nextInt(10) + 1;
	protected int oilLevel = rngRobo2;

	public RoboDog(String name, String description, int hunger, int boredom, int needToPotty, int tiredness, int thirst,
			int totalHappiness, int totalHealth, int oilLevel) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
		this.oilLevel = oilLevel;
		this.hunger = 0;
		this.needToPotty = 0;
		this.thirst = 0;
	}

	public RoboDog(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.needToPotty = 0;
		this.thirst = 0;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilPets() {
		int oiling = 25;
		oilLevel += oiling;
		totalHappiness += oiling;
	}

}
