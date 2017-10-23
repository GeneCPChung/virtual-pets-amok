import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	protected int litterBox = 0;
	protected int incommingPoop;
	OrganicCat litterBoxFill = new OrganicCat(null, null, 0, 0, 0, 0, 0, 0, 0);

	private Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public Map<String, VirtualPet> getShelteredPets() {
		return shelteredPets;
	}

	public Collection<VirtualPet> shelteredPetsValues() {
		return shelteredPets.values();
	}

	public int getLitterBox() {
		return litterBox;
	}

	public VirtualPet accessShelteredPet(VirtualPet name) {
		return name;
	}

	public void cleanDogCages() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (!(pets instanceof RoboticInterface)) {
				((OrganicDog) pets).cageCleanliness = 0;
			}
		}
	}

	public void feedOrganicPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (pets instanceof OrganicCat) {
				((OrganicCat) pets).feedPets();
			}
			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).feedPets();
			}
		}
	}

	public void playWithPet(String name) {
		VirtualPet pets = shelteredPets.get(name);
		pets.playing();
	}

	public void restPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.sleeping();
		}
	}

	public void waterPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).waterPets();
			}
			if (pets instanceof OrganicCat) {
				((OrganicCat) pets).waterPets();
			}
		}
	}

	public void walkTheDogs() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (pets instanceof DogParent) {
				((DogParent) pets).takeAWalk();
			}
		}
	}

	public void oilRobots() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (pets instanceof RoboCat) {
				((RoboCat) pets).oilPets();
			}
			if (pets instanceof RoboDog) {
				((RoboDog) pets).oilPets();
			}
		}
	}

	public void petUpdate() {

		for (VirtualPet pets : shelteredPets.values()) {

			if (pets instanceof RoboDog) {
				((RoboDog) pets).getRoboDogTick();
			}

			if (pets instanceof RoboDog) {
				((RoboDog) pets).calcRoboHappiness();
			}

			if (pets instanceof RoboCat) {
				((RoboCat) pets).getRoboCatTick();
			}
			if (pets instanceof RoboCat) {
				((RoboCat) pets).calcRoboHappiness();
			}

			if (pets instanceof OrganicCat) {
				((OrganicCat) pets).calcCatHappiness();
			}
			if (pets instanceof OrganicCat) {
				((OrganicCat) pets).getCatTick();
			}
			if (pets instanceof OrganicCat) {
				incommingPoop = ((OrganicCat) pets).getlitterBox();
				litterBox += incommingPoop;
			}
			if (pets instanceof OrganicCat) {
				incommingPoop = ((OrganicCat) pets).removeLitterBox();
			}

			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).cageCleanliness += ((OrganicDog) pets).rngDog1;
				((OrganicDog) pets).getDogTick();
			}

			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).calcDogHappiness();
			}

			pets.getTick();
		}
	}

	public void litterBoxStatus() {
		System.out.println("Litter box is currently at: " + litterBox);
	}

	public void petList() {
		System.out.println("Name\t\t|Happy\t|Health\t|Bored\t|Tired\t|Hunger\t|Thirst\t|Cages\t|OilLevel");
		System.out.println("-------\t\t|------\t|------\t|------\t|------\t|------\t|------\t|------\t|------");
		for (Entry<String, VirtualPet> entry : shelteredPets.entrySet()) {
			System.out.println(entry.getValue());

		}
	}

	public void emptyLitterbox() {
		this.getLitterBox();
	}

	public void addPet(VirtualPet shelteredPet) {
		shelteredPets.put(shelteredPet.getName(), shelteredPet);
	}

	public void removePet(String name) {
		shelteredPets.remove(name);
	}

}
