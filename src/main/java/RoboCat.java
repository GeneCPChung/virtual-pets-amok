
public class RoboCat extends VirtualPet implements RoboticInterface{

	public RoboCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst);
	}

	public RoboCat(String name, String description) {
		super(name, description);
	}

	@Override
	public void oilPets() {
	}

}
