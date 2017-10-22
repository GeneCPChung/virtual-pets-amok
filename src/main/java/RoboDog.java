import java.util.Random;

public class RoboDog extends DogParent implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;
	int rngRobo2 = rand.nextInt(10) + 1;
	protected int oilLube = rngRobo2;

	public RoboDog(String name, String description, int boredom, int tiredness, int totalHappiness, int totalHealth,
			int oilLube) {
		super(name, description);
		this.oilLube = oilLube;

	}

	public RoboDog(String name, String description) {
		super(name, description);
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
