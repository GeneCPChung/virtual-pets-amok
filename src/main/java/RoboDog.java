import java.util.Random;

public class RoboDog extends DogParent implements RoboticInterface {
	Random rand = new Random();
	int rngRobot = rand.nextInt(10) + 1;
	int rngRobo1 = rand.nextInt(5) + 1;
	int rngRobo2 = rand.nextInt(5) + 1;
	protected int oilLube = rngRobo1;

	public RoboDog(String name, String description, int boredom, int tiredness, int totalHappiness, int totalHealth,
			int oilLube) {
		super(name, description);
		this.oilLube = oilLube;

	}

	public RoboDog(String name, String description) {
		super(name, description);
	}

	public int calcRoboHealth() {
		int robotHealth = boredom + tiredness + oilLube;
		if (robotHealth > 25) {
			totalHealth -= 5;
		}
		return robotHealth;
	}

	public void calcRoboHappiness() {

		if (calcRoboHealth() <= 25) {
			totalHappiness += 5;
		}
		if (calcRoboHealth() > 25) {
			totalHappiness -= 5;
		}
	}

	public int getOilLevel() {
		return oilLube;
	}

	public int getRoboDogTick() {

		int tickStat = rngAct;
		if (tickStat < 15) {
			oilLube += rngRobo2;
			return tickStat;
		}
		if (tickStat >= 15) {
			oilLube += rngRobo1;
			return tickStat;
		} else {
			return 0;
		}
	}

	@Override
	public void oilPets() {
		oilLube = 0;
		totalHappiness += 15;

	}

	@Override
	public String toString() {
		return super.toString() + "\t|" + "\t|" + "\t|" + oilLube;
	}

}
