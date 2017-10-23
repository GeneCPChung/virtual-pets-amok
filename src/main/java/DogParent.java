import java.util.Random;

public class DogParent extends VirtualPet {
	Random rand = new Random();
	int rngWlk = rand.nextInt(10) + 1;

	protected int walking = rngWlk;

	public DogParent(String name, String description, int boredom, int tiredness, int totalHappiness, int totalHealth) {
		super(name, description);
	}

	public DogParent(String name, String description) {
		super(name, description);

	}

	public int getWalking() {
		return walking;
	}

	public void takeAWalk() {
		this.totalHappiness += walking;
	}

}
