import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var RewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, RewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var RewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, RewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 10000;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.00035; // Conversion rate: 1 mile = 0.0035 cash
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * 0.00035; // Conversion rate: 1 mile = 0.0035 cash
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01);

    }
}
