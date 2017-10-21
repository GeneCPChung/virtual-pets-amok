import java.util.Random;

public class RoboCat extends VirtualPet implements RoboticInterface {
	Random rand = new Random();
	int rngRobo1 = rand.nextInt(10) + 1;

	public RoboCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness, int thirst,
			int totalHappiness, int totalHealth) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
		this.hunger = 0;
		this.needToPotty = 0;
		this.thirst = 0;
	}

	public RoboCat(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.needToPotty = 0;
		this.thirst = 0;
	}

	@Override
	public void oilPets() {
		int oiling = 25;
		hunger -= oiling;
	}

}
