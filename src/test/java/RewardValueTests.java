import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double DELTA = 1e-6;
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new main.java.RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new main.java.RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        double expectedMiles = cashValue / 0.0035;

        main.java.RewardValue reward = new main.java.RewardValue(cashValue);
        assertEquals(expectedMiles, reward.getMilesValue(), DELTA, "Conversion from cash to miles failed");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCash = milesValue * 0.0035;

        main.java.RewardValue reward = new main.java.RewardValue(milesValue);
        assertEquals(expectedCash, reward.getCashValue(), DELTA, "Conversion from miles to cash failed");
    }


}
