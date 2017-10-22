import java.util.Random;

public class RoboCat extends VirtualPet implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;

	public RoboCat(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth, int oilLube) {
		super(name, description, hunger, boredom, cageCleanliness, tiredness, thirst, totalHappiness, totalHealth,
				oilLube);
		this.hunger = 0;
		this.cageCleanliness = 0;
		this.thirst = 0;
	}

	public RoboCat(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.cageCleanliness = 0;
		this.thirst = 0;
	}

	@Override
	public void oilPets() {
		int oiling = 25;
		hunger -= oiling;
	}

}
