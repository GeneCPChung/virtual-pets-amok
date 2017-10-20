import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class VirtualPetShelter {

private	Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public void accessShelteredPets(Map<String, VirtualPet> shelteredPets) {
		this.shelteredPets = shelteredPets;
	}
	public Map<String, VirtualPet> getShelteredPets() {
		return shelteredPets;
	}
	
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
	
	public void petList() {
		System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
		System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
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
