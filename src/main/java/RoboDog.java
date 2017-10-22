import java.util.Random;

public class RoboDog extends DogParent implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;
	int rngRobo2 = rand.nextInt(10) + 1;
	protected int oilLube = rngRobo2;

	public RoboDog(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth, int oilLube) {
		super(name, description, hunger, boredom, cageCleanliness, tiredness, thirst, totalHappiness, totalHealth,
				oilLube);
		this.oilLube = oilLube;
		this.hunger = 0;
		this.cageCleanliness = 0;
		this.thirst = 0;
	}

	public RoboDog(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.cageCleanliness = 0;
		this.thirst = 0;
	}

	public int getOilLevel() {
		return oilLube;
	}

	@Override
	public void oilPets() {
		int oiling = 25;
		oilLube += oiling;
		totalHappiness += oiling;
	}

}
