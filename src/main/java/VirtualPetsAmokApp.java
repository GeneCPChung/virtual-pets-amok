import java.util.Map.Entry;
import java.util.Scanner;




public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();
		VirtualPet curly = new VirtualPet("shemp", " German Shephard");
		VirtualPet larry = new VirtualPet("larry", " the RoboDog");
		VirtualPet moe = new VirtualPet("moe", " the RoboCat");
		VirtualPet shemp = new VirtualPet("curly", " the Cat");

		petShelter.addPet(curly);
		petShelter.addPet(larry);
		petShelter.addPet(moe);
		petShelter.addPet(shemp);

		System.out.println("Welcome to our animal shelter! Here is a list of the animals staying with us: \n");
		statTemplate();
		for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
			System.out.println(entry.getValue());
		}
		menuOptions();
		String userOpt;

		do {
			//Tick
			petShelter.petUpdate();
			
			userOpt = input.nextLine();
			
			//Game
			if (userOpt.equals("1")) {
				petShelter.feedPets();
				System.out.println("You fed all of the pets\n");
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}		
				menuOptions();
			}
			if (userOpt.equals("2")) {
				System.out.println("Awesome, you want to play with one of the pets! Please choose one to play with: \n");
				for (VirtualPet i : petShelter.shelteredPetsValues()) {
					System.out.print(i.getName());
					System.out.println("" + i.getDescription());
				}
				userOpt = input.nextLine();
				petShelter.playWithPet(userOpt);
				System.out.println("You played with " + userOpt);
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("3")) {
				petShelter.pottyPets();
				System.out.println("Break out a shovel, you got lots of poop to pick up!\n");
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("4")) {
				petShelter.restPets();
				System.out.println("You gave all your pets a nap\n");
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("5")) {
				petShelter.waterPets();
				System.out.println("You watered all of your pets");
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("6")) {
				System.out.println("Here are the updated stats for all of the pets: ");
				statTemplate();
				for (Entry<String, VirtualPet> entry : petShelter.getShelteredPets().entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("7")) {
				System.out.println("Thank you so much for adopting a pet!\nWhich pet would you like to adopt?\n");
				for (VirtualPet i : petShelter.shelteredPetsValues()) {
					System.out.print(i.getName());
					System.out.println("" + i.getDescription());
				}
				userOpt = input.nextLine().toLowerCase();
				petShelter.removePet(userOpt);
				System.out.println("You adopted " + userOpt + "\nThanks again for adopting a pet!");
				menuOptions();
			}
			if (userOpt.equals("8")) {
				System.out.println("We will be happy to look after a pet for you.\nWhat is the name of the pet?\n");
				String admitPetName = input.nextLine().toLowerCase();
				System.out.println("Please give a description of what the pet looks like: \n");
				String admitPetDesc = input.nextLine().toLowerCase();
				VirtualPet newPet = new VirtualPet(admitPetName, admitPetDesc);
				petShelter.addPet(newPet);
				System.out.println("You adopted " + userOpt + "\nThanks again for adopting a pet!");
				menuOptions();
			}
		} while (!userOpt.equals("9"));

	}
	
	public static void statTemplate() {
		System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
		System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
	}

	public static void menuOptions() {
		System.out.println("\nWhat would you like to help with?");
		System.out.println("\n1: Feed all of the pets");
		System.out.println("2: Play with one of the pets");
		System.out.println("3 Potty all the pets");
		System.out.println("4 Give the pets a nap");
		System.out.println("5: Give all of the pets some water");
		System.out.println("6 Check on the pets stats");
		System.out.println("7: Adopt a pet");
		System.out.println("8: Admit a pet");
		System.out.println("9 Quit");
	}
}
