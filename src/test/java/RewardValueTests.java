import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
@Test
    public void testConvertMilesToCash() {
        RewardValue rewardValue = new RewardValue();

        assertEquals(0.0, rewardValue.convertMilesToCash(0), 0.0001);
        assertEquals(0.35, rewardValue.convertMilesToCash(100), 0.0001);
        assertEquals(3.5, rewardValue.convertMilesToCash(1000), 0.0001);
        assertEquals(35.0, rewardValue.convertMilesToCash(10000), 0.0001);
    }
    @Test
    public void testConvertCashToMiles() {
        RewardValue rewardValue = new RewardValue();

        assertEquals(0.0, rewardValue.convertCashToMiles(0), 0.0001);
        assertEquals(28571.4286, rewardValue.convertCashToMiles(100), 0.0001);
        assertEquals(285714.2857, rewardValue.convertCashToMiles(1000), 0.0001);
        assertEquals(2857142.8571, rewardValue.convertCashToMiles(10000), 0.0001);
    }

}
