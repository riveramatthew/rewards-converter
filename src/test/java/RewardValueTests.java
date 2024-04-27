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
        double valueMiles = 10000;
        var rewardsValue = new RewardValue(valueMiles);
        double cashToMiles = rewardsValue.getCashValue()/ 0.0035;
        double expectedMilesValue = cashToMiles;
        assertEquals(expectedMilesValue,cashToMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int valueMiles = 10000;
        var rewardsValue = new RewardValue(valueMiles);
        int milesToCash = (int)(rewardsValue.getMilesValue() * 0.0035);
        int expectedCashValue = milesToCash;
        assertEquals(expectedCashValue,milesToCash);
    }
}
