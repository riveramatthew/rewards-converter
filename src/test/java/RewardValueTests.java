package main.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void testCashToMilesConversion() {
        // Test converting from cash to miles
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.0001);
    }

    @Test
    public void testMilesToCashConversion() {
        // Test converting from miles to cash
        double milesValue = 28571.43;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void testGetCashValue() {
        // Pre-existing test to get cash value
        double cashValue = 50;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    public void testGetMilesValue() {
        // Pre-existing test to get miles value
        double milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
}
