import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();
		OrganicDog curly = new OrganicDog("Shemp", " the Dog");
		RoboDog larry = new RoboDog("Larry", " RoboDog");
		RoboCat moe = new RoboCat("Moe", " RoboCat");
		OrganicCat shemp = new OrganicCat("Curly", " the Cat");
		OrganicCat sherry = new OrganicCat("Sherry", " the Cat");

		petShelter.addPet(curly);
		petShelter.addPet(larry);
		petShelter.addPet(moe);
		petShelter.addPet(shemp);
		petShelter.addPet(sherry);

		System.out.println("Thanks for volunteering at our shelter! Here is a list of the animals that we have: \n");
		petShelter.petList();
		menuOptions();
		String userOpt;
		do {
			// Tick
			petShelter.petUpdate();
			userOpt = input.nextLine();

			// Game

			// Create feeding based on robot or organic
			if (userOpt.equals("1")) {
				System.out.println("Would you like to feed the Robot Pets or Organic Pets?");
				System.out.println("Choose:\n1: To feed the Robot Pets\n2: To feed the Organic Pets");

				menuOptions();
			}
			if (userOpt.equals("2")) {
				System.out
						.println("Awesome, you want to play with one of the pets! Please choose one to play with: \n");
				for (VirtualPet i : petShelter.shelteredPetsValues()) {
					System.out.print(i.getName());
					System.out.println("" + i.getDescription());
				}
				userOpt = input.nextLine().toLowerCase();
				userOpt = userOpt.substring(0, 1).toUpperCase() + userOpt.substring(1).toLowerCase();
				petShelter.playWithPet(userOpt);
				System.out.println("You played with " + userOpt);
				petShelter.petList();
				menuOptions();
			}
			if (userOpt.equals("3")) {
				petShelter.cleanDogCages();
				System.out.println("All the dog cages have been cleaned\n");
				petShelter.petList();
				menuOptions();
			}
			if (userOpt.equals("4")) {
				petShelter.restPets();
				System.out.println("You gave all your pets a nap\n");
				petShelter.petList();
				menuOptions();
			}
			if (userOpt.equals("5")) {
				petShelter.waterPets();
				System.out.println("You watered all of your pets");
				petShelter.petList();
				menuOptions();
			}
			if (userOpt.equals("6")) {
				System.out.println("Here are the updated stats for all of the pets: ");
				petShelter.petList();
				menuOptions();
			}
			if (userOpt.equals("7")) {
				System.out.println("Thank you so much for adopting a pet!\nWhich pet would you like to adopt?\n");
				for (VirtualPet i : petShelter.shelteredPetsValues()) {
					System.out.print(i.getName());
					System.out.println("" + i.getDescription());
				}
				userOpt = input.nextLine().toLowerCase();
				userOpt = userOpt.substring(0, 1).toUpperCase() + userOpt.substring(1).toLowerCase();
				petShelter.removePet(userOpt);
				System.out.println("You adopted " + userOpt + "\nThanks again for adopting a pet!");
				menuOptions();
			}
			if (userOpt.equals("8")) {
				System.out.println("We will be happy to look after a pet for you.\nWhat is the name of the pet?\n");
				String admitPetName = input.nextLine().toLowerCase();
				System.out.println("What type of pet? Choose one:");
				System.out.println("Dog");
				System.out.println("Cat");
				System.out.println("Robot Dog");
				System.out.println("Robot Cat");
				String admitPetDesc = input.nextLine().toLowerCase();

				if (admitPetDesc.equalsIgnoreCase("Dog")) {

					OrganicDog newPet = new OrganicDog(admitPetName, admitPetDesc);
					petShelter.addPet(newPet);
				}
				if (admitPetDesc.equalsIgnoreCase("Robot Dog")) {
					RoboDog newPet = new RoboDog(admitPetName, admitPetDesc);
					petShelter.addPet(newPet);
				}
				if (admitPetDesc.equalsIgnoreCase("Cat")) {
					OrganicCat newPet = new OrganicCat(admitPetName, admitPetDesc);
					petShelter.addPet(newPet);
				}
				if (admitPetDesc.equalsIgnoreCase("Robot Cat")) {
					RoboCat newPet = new RoboCat(admitPetName, admitPetDesc);
					petShelter.addPet(newPet);
				}

				System.out.println("You admitted " + admitPetName + "\nThank you!");
				menuOptions();
			}
			if (userOpt.equals("9")) {
				petShelter.walkTheDogs();
				System.out.println("The dogs enjoyed their walk around the neighborhood\n");
				petShelter.petList();
				menuOptions();
			}
		} while (!userOpt.equals("10"));

	}

	public static void menuOptions() {
		System.out.println("\nWhat would you like to help with?\n");
		System.out.println("1: Feed all of the pets");
		System.out.println("2: Play with one of the pets");
		System.out.println("3: Clean the dog cages");
		System.out.println("4: Give the pets a nap");
		System.out.println("5: Give all of the pets some water");
		System.out.println("6: Check on the pets stats");
		System.out.println("7: Adopt a pet");
		System.out.println("8: Admit a pet");
		System.out.println("9: Take the dogs for a walk");
		System.out.println("10: Quit");
	}
}
