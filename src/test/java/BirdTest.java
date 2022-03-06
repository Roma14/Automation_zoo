import Zoo.Bird;
import Zoo.Crow;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BirdTest {
    private String birdMovementExpected = "fly";
    private String birdBreathExpected = "breathe through the beak";
    Bird bird1 = new Bird();

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("Tests are started");
    }

    @AfterClass
    public void AfterClassTest() {
        System.out.println("Tests are completed");
    }

    @Test(groups = "positive")
    public void BirdReturnMovement() {
        String actualResult = bird1.movement();
        assertEquals(actualResult, birdMovementExpected);
    }

    @Test(groups = "positive")
    public void BirdReturnBreath() {
        String actualResult = bird1.breath();
        assertTrue(actualResult.equals(birdBreathExpected), String.format("Actual: %s\nExpected: %s\n", actualResult, birdBreathExpected));
    }

    @Test(groups = "positive")
    public void BirdClassCheck() {
        assertTrue(bird1 instanceof Bird);
    }

    @Test(groups = "negative")
    public void BirdClassCheckWrong() {
        Crow crow1 = new Crow();
        assertNotEquals(crow1, bird1);
    }

    @Test(enabled = false)
    public void WrongTest() {
        System.out.println("This test should not be performed");
    }
}
