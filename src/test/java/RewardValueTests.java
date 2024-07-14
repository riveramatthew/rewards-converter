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
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }

    @Test
    public void testCashToMilesConversion() {
        double cash = 100.0; // example amount
        RewardValue reward = new RewardValue(cash);
        double expectedMiles = cash / 0.0035; // assuming this is the conversion rate
        assertEquals(expectedMiles, reward.getMilesValue(), 0.01, "Cash to miles conversion did not match expected value.");
    }

    @Test
    public void testMilesToCashConversion() {
        double miles = 1000.0; // example miles
        RewardValue reward = new RewardValue(miles, true);
        double expectedCash = miles * 0.0035; // assuming this is the conversion rate
        assertEquals(expectedCash, reward.getCashValue(), 0.01, "Miles to cash conversion did not match expected value.");
    }

}
