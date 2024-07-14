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
        double cashValue = 100;
        int exp_miles=28571;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(exp_miles, rewardValue.convertFromCashToMiles(cashValue));
       // assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        int exp_cash =35;
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(exp_cash, rewardValue.convertFromMilesToCash(milesValue));
        //assert false;
    }
}
