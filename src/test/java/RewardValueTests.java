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
        double cashValue = 3;
        var rewardValue = new RewardValue(cashValue);
        //3 cash equates to 857 miles
        assertEquals(857, rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 857;
        var rewardValue = new RewardValue(milesValue);
        //857 miles equates to 2.9995 cash
        assertEquals(2.9995, rewardValue.getCashValue());
    }
}
