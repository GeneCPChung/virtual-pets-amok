
public class RoboDog extends DogParent implements RoboticInterface{

	

	public RoboDog(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst);
	}

	@Override
	public void oilPets() {
	}

}
