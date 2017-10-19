
public abstract class DogParent extends VirtualPet {

	protected int walking;

	public DogParent(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst);
	}

}
