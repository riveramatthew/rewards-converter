import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double DELTA = 1e-9; // Precision for floating-point comparison

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), DELTA);
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), DELTA);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;  // Example cash value
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;  // Conversion rate from cash to miles
        assertEquals(expectedMiles, rewardValue.getMilesValue(), DELTA);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;  // Example miles value
        var rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035;  // Conversion rate from miles to cash
        assertEquals(expectedCash, rewardValue.getCashValue(), DELTA);
    }
}
