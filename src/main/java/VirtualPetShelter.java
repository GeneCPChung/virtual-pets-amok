import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	private int litterBox = 0;

	private Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public Map<String, VirtualPet> getShelteredPets() {
		return shelteredPets;
	}

	public Collection<VirtualPet> shelteredPetsValues() {
		return shelteredPets.values();
	}

	public VirtualPet accessShelteredPet(VirtualPet name) {
		return name;
	}

	public int getLitterBox() {
		return litterBox;
	}

	public void cleanLitterBox() {
		litterBox = 0;
	}

	public void playWithPet(String name) {
		VirtualPet pets = shelteredPets.get(name);
		pets.playing();
	}

	public boolean petPresent(String name) {
		return (shelteredPets.containsKey(name));
	}

	public void pottyPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.pooping();
		}
	}

	public void restPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.sleeping();
		}
	}

	public void waterPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.drinking();
		}
	}

	public void petUpdate() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.getTick();
			fillLitterBox();

		}
	}

	public void fillLitterBox() {
		for (VirtualPet pets : shelteredPets.values()) {
			if (pets instanceof OrganicCat) {
				litterBox += 5;
			}
		}
	}

	public void litterBoxStatus() {
		if (this.getLitterBox() <= 5) {
			System.out.println(litterBox);
			System.out.println("Litter Box is about empty.");
		}
		if (this.getLitterBox() >= 5) {
			System.out.println(litterBox);
			System.out.println("Litter Box is 1/4 full.");
		}

	}

	public void petList() {
		System.out.println("Name\t\t|Health\t|Happy\t|Hunger\t|Bored\t|Potty\t|Tired\t|Thirst");
		System.out.println("-------\t\t|------\t|------\t|------\t|------\t|------\t|------\t|------");
		for (Entry<String, VirtualPet> entry : shelteredPets.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public void addPet(VirtualPet shelteredPet) {
		shelteredPets.put(shelteredPet.getName(), shelteredPet);
	}

	public void removePet(String name) {
		shelteredPets.remove(name);
	}

}
