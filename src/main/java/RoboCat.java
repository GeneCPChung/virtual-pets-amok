import java.util.Random;

public class RoboCat extends VirtualPet implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;
	protected int oilLube;

	public RoboCat(String name, String description, int boredom, int tiredness, int totalHappiness, int totalHealth,
			int oilLube) {
		super(name, description, boredom, tiredness, totalHappiness, totalHealth);
		this.oilLube = oilLube;

	}

	public RoboCat(String name, String description) {
		super(name, description);
	}

	@Override
	public void oilPets() {
		int oiling = 25;
		oilLube -= oiling;
	}

}
