import Zoo.Fish;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FishTest {

    private String fishMovementExpected = "swim";
    private String fishBreathExpected = "breathe through the gills";
    Fish fish1 = new Fish();

    @Test(groups = "positive")
    public void FishtReturnMovement() {
        String actualResult = fish1.movement();
        assertEquals(actualResult, fishMovementExpected);
    }

    @Test(groups = "positive")
    public void FishReturnBreath() {
        String actualResult = fish1.breath();
        assertTrue(actualResult.equals(fishBreathExpected), String.format("Actual: %s\nExpected: %s\n", actualResult, fishBreathExpected));
    }

    @Test(groups = "positive")
    public void FishClassCheck() {
        assertTrue(fish1 instanceof Fish);
    }

    @Test(groups = "negative", enabled = false)
    public void FailedTestcase() {
        int a = 10;
        int b = 5;
        int c = a + b;
        assertTrue(c == 18, "Something went wrong!");
    }

}
