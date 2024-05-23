import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
        assertEquals(cashValue / 0.0035, rewardValue.getMilesValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 20000;
        var rewardValue = new RewardValue(milesValue,true );
        assertEquals(milesValue, rewardValue.getMilesValue());
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 20000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}
