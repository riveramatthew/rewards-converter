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
        double cashValue = 100; // Example cash value
        double expectedMiles = cashValue / 0.0035; // Conversion logic based on  RewardValue class
        RewardValue rewardValue = new RewardValue(cashValue);

        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01, "Miles value did not match expected conversion from cash.");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 500; // Example miles value
        double expectedCash = milesValue * 0.0035; // Conversion logic based on RewardValue class
        RewardValue rewardValue = new RewardValue(milesValue);

        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01, "Cash value did not match expected conversion from miles.");
    }
}
