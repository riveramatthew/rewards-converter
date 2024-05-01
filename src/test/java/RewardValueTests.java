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
        double milesValue = 10000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double actualMilesValue = rewardValue.getMilesValue();
        assertEquals(milesValue, actualMilesValue);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double milesValue = rewardValue.getMilesValue();
        assertEquals(28571.428571428572, milesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 50000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double cashValue = rewardValue.getCashValue();
        assertEquals(175.0, cashValue);
    }
}
