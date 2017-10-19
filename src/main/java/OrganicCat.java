
public class OrganicCat extends VirtualPet implements OrganicInterface{

	public OrganicCat(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst);
	}

	@Override
	public void feedPets() {
	}

	@Override
	public void waterPets() {
	}

	@Override
	public void cleanPets() {
	}

}
