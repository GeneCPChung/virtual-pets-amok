
public class RoboCat extends VirtualPet implements RoboticInterface{

	public RoboCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst, int totalHappiness, int totalHealth) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst, totalHappiness, totalHealth);
	}

	public RoboCat(String name, String description) {
		super(name, description);
	}

	@Override
	public void oilPets() {
	}

}
