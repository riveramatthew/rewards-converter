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

        //test if round up
        int milesValue = 4286;
        var rewardValue = new RewardValue(15.0);
        assertEquals(milesValue,rewardValue.getMilesValue());

        //test for not rounding up
        milesValue = 2874;
        rewardValue = new RewardValue(10.06);
        assertEquals(milesValue,rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 0.042;
        var rewardValue = new RewardValue(12);
        assertEquals(cashValue,rewardValue.getCashValue());
    }
}
