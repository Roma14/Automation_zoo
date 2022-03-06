import Zoo.Beast;
import Zoo.Lion;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class BeastTest {
    private String beastMovementExpected = "run";
    private String beastBreathExpected = "breathe through the nose";
    Beast beast1 = new Beast();

    @BeforeGroups("positive")
    public void BeforePossitiveTest() {
        System.out.println("Positive tests are started");
    }

    @AfterGroups("positive")
    public void AfterPossitiveTest() {
        System.out.println("Positive tests are completed");
    }


    @Test(groups = "positive")
    public void BeastReturnMovement() {
        String actualResult = beast1.movement();
        assertEquals(actualResult, beastMovementExpected);
    }

    @Test(groups = "positive")
    public void BeastReturnBreath() {
        String actualResult = beast1.breath();
        assertTrue(actualResult.equals(beastBreathExpected), String.format("Actual: %s\nExpected: %s\n", actualResult, beastBreathExpected));
    }

    @Test(groups = "positive")
    public void BeastClassCheck() {
        assertTrue(beast1 instanceof Beast);
    }


    @Test(groups = "negative")
    public void BeastClassCheck2() {
        Beast lion1 = new Lion();
        System.out.println(lion1.getClass());
        assertTrue(lion1 instanceof Beast, String.format("Actual: %s\nExpected: %s\n", lion1.getClass(), beast1.getClass()));
    }

}
