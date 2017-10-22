import java.util.Random;

public class DogParent extends VirtualPet {
	Random rand = new Random();
	int rngWlk = rand.nextInt(10) + 1;

	protected int walking = 5;

	public DogParent(String name, String description, int hunger, int boredom, int cageCleanliness, int tiredness,
			int thirst, int totalHappiness, int totalHealth, int oilLube) {
		super(name, description, hunger, boredom, cageCleanliness, tiredness, thirst, totalHappiness, totalHealth,
				oilLube);
	}

	public DogParent(String name, String description) {
		super(name, description);

	}

	public int getWalking() {
		return walking;
	}

	public void takeAWalk() {
		this.totalHappiness += walking;
		this.boredom -= walking;
		this.cageCleanliness -= walking;
	}

}
