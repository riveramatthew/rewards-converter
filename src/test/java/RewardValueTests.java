import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double DELTA = 0.001;
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
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);

        // Calculate expected miles value based on conversion rate
        double expectedMilesValue = cashValue / 0.0035;

        // Perform conversion
        double actualMilesValue = rewardValue.fromCashToMiles();

        // Assert
        assertEquals(expectedMilesValue, actualMilesValue, DELTA);
    }

    @Test
    void convert_from_miles_to_cash() {

            int milesValue = 10000;
            var rewardValue = new RewardValue(milesValue);

            // Calculate expected cash value based on conversion rate
            double expectedCashValue = milesValue * 0.0035;

            // Perform conversion
            double actualCashValue = rewardValue.fromMilesToCash();

            // Assert
            assertEquals(expectedCashValue, actualCashValue, DELTA);
    }
}
