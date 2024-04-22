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
        //Here the cashValue is fixed as 937.73 and dividing
        //cashValue with 0.0035 gives 267922.
        double cashValue = 937.73;
        var rewardsValue = new RewardValue(cashValue);
        assertEquals(rewardsValue.getMilesValue(), 267922);
    }

    @Test
    void convert_from_miles_to_cash() {
        //Here the milesValue is fixed as 194000, and multiplying
        //milesValue by 0.0035 gives 679.
        int milesValue = 194000;
        var rewardsValue = new RewardValue(milesValue);
        assertEquals(rewardsValue.getCashValue(), 679);
    }
}
