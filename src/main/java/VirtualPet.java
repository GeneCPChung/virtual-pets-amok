import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPet {
	Random rand = new Random();
	int rngAct = rand.nextInt(10) + 1;
	int rngNum1 = rand.nextInt(10) + 1;
	int rngNum2 = rand.nextInt(10) + 1;
	int rngNum3 = rand.nextInt(10) + 1;
	int rngNum4 = rand.nextInt(10) + 1;
	int rngNum5 = rand.nextInt(10) + 1;
	int rngNum6 = rand.nextInt(10) + 1;

	// Instance Data
	private String name;
	private String description;
	private int hunger = rngNum1;
	private int boredom = rngNum2;
	private int needToPotty = rngNum3;
	private int tiredness = rngNum4;
	private int thirst = rngNum5;

	// Constructor
	public VirtualPet(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
		this.thirst = thirst;
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// Accessors
	public int getTick() {

		int tickStat = rngNum6;
		if (tickStat < 6) {

			hunger += rngNum1;
			boredom += rngNum2;
			needToPotty += rngNum3;
			tiredness += rngNum4;
			thirst += rngNum5;
			return tickStat;

		}
		if (tickStat >= 6) {
			hunger += rngNum5;
			boredom += rngNum4;
			needToPotty += rngNum3;
			tiredness += rngNum2;
			thirst += rngNum1;
			return tickStat;

		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getNeedToPotty() {
		return needToPotty;
	}

	public int getTiredness() {
		return tiredness;
	}

	public int getThirst() {
		return tiredness;
	}

	// Actions
	void feeding() {
		int eating = rngAct;
		hunger += eating;
		needToPotty += eating;

	}

	void playing() {
		int play = rngAct;
		boredom += play;
		tiredness += play;
	}

	void pooping() {
		int pooping = rngAct;
		needToPotty -= pooping;
		boredom += pooping;
	}

	void sleeping() {
		int sleeping = rngAct;
		tiredness -= sleeping;
		hunger += sleeping;
	}

	void drinking() {
		int drinking = rngAct;
		thirst -= drinking;
		needToPotty += drinking;
	}

	@Override
	public String toString() {
		return "" + this.name + this.description + "\t|" + this.hunger + "\t|" + this.boredom + "\t|" + this.needToPotty
				+ "\t|" + this.tiredness + "\t|" + this.thirst;
	}

}
