import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetsAmokTest {
	@Test
	public void shouldBeAbleToCreateARoboCatObject() {
		RoboCat underTest = new RoboCat(null, null, 0, 0, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	// @Test
	// public void assertThatDogsAreBeingWalked() {
	// DogParent underTest = new DogParent(null, null, 0, 75, 0, 0, 0, 0, 0);
	// underTest.takeAWalk();
	// int check = underTest.getBoredom();
	// assertEquals(check, 50);
	// }

	// @Test
	// public void assertThatCatsAreBeingFed() {
	// OrganicCat underTest = new OrganicCat(null, null, 75, 0, 0, 0, 0, 0, 0);
	// underTest.feedPets();
	// int check = underTest.getHunger();
	// assertEquals(check, 50);
	// }

	@Test
	public void assertThatRoboCatsAreBeingOiled() {
		RoboCat underTest = new RoboCat(null, null, 75, 0, 0, 0, 0, 0, 0);
		underTest.oilPets();
		int check = underTest.getHunger();
		assertEquals(check, 50);
	}

	@Test
	public void assertThatTheLitterBoxIsBeingFilledProperly() {
		RoboCat underTest = new RoboCat(null, null);
		RoboCat underTest2 = new RoboCat(null, null);
		underTest.oilPets();
		int check = underTest.getHunger();
		assertEquals(check, 50);
	}

	// @Test
	// public void assertThatDogCagesAreCleaned() {
	// OrganicDog underTest = new OrganicDog(null, null);
	// underTest.cleanPets();
	// int check = underTest.getCageStatus();
	// assertEquals(check, 1);
	// }

}
