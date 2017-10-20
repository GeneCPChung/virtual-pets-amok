
public class OrganicDog extends DogParent implements OrganicInterface{

	
	public OrganicDog(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		super(name, description, hunger, boredom, needToPotty, tiredness, thirst);
	}
	public OrganicDog(String name, String description) {
		super(name, description);
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
