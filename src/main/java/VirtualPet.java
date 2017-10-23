import java.util.Random;

public abstract class VirtualPet {
	Random rand = new Random();
	int rngAct = rand.nextInt(25) + 1;
	int rngNum1 = rand.nextInt(10) + 1;
	int rngNum2 = rand.nextInt(5) + 1;
	int rngNum3 = rand.nextInt(5) + 1;
	int rngNum4 = rand.nextInt(5) + 1;
	int rngNum5 = rand.nextInt(5) + 1;
	int rngNum6 = rand.nextInt(10) + 1;
	int rngNum7 = rand.nextInt(10) + 1;
	int rngNum8 = rand.nextInt(10) + 1;
	int rngNum9 = rand.nextInt(5) + 1;
	int rngNum10 = rand.nextInt(5) + 1;

	// Instance Data

	protected String name;
	protected String description;
	protected int boredom = rngNum2;
	protected int tiredness = rngNum4;
	protected int totalHappiness = 50;
	protected int totalHealth = 50;
	protected int oilLube = rngNum9;

	// Constructor
	public VirtualPet(String name, String description, int boredom, int tiredness, int totalHappiness,
			int totalHealth) {
		this.name = name;
		this.description = description;
		this.boredom = boredom;
		this.tiredness = tiredness;
		this.totalHappiness = totalHappiness;
		this.totalHealth = totalHealth;
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// Accessors
	public int getTick() {

		int tickStat = rngNum6;
		if (tickStat < 6) {
			boredom += rngNum2;
			tiredness += rngNum4;
			return tickStat;
		}
		if (tickStat >= 6) {
			boredom += rngNum4;
			tiredness += rngNum2;
			return tickStat;
		} else {
			return 0;
		}
	}

	public int getBoredom() {
		return boredom;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public int getTiredness() {
		return tiredness;
	}

	public int getTotalHappiness() {
		return totalHappiness;
	}

	public int getTotalHealth() {
		return totalHealth;
	}

	// Actions

	void playing() {
		int play = rngNum1;
		boredom -= play;
		tiredness += play;
		if (boredom < 0) {
			boredom = 0;
		}
	}

	void sleeping() {
		int sleeping = rngNum2;
		tiredness -= sleeping;
		if (tiredness < 0) {
			tiredness = 0;
		}
	}

	@Override
	public String toString() {
		return "" + this.name + this.description + "\t|" + this.totalHappiness + "\t|" + this.totalHealth + "\t|"
				+ boredom + "\t|" + tiredness + "\t|";

	}

}
