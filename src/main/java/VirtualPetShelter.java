import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> shelteredPetsValues() {
	return shelteredPets.values();
	}

	public VirtualPet accessShelteredPet(VirtualPet name) {
		return name;
	}

	public void feedPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.feeding();
		}
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
		}
	}
	
	public void addPet(VirtualPet shelteredPet) {
		shelteredPets.put(shelteredPet.getName(), shelteredPet);
	}

	public void removePet(String name) {
		shelteredPets.remove(name);
	}


}
