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
        double cashValue2 = 100;
        double expectedval = (int)(cashValue2/0.0035);
        var rewardValue = new RewardValue(cashValue2);
        assertEquals(expectedval,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int mileValue2 = 100;
        double expectedval = (int)mileValue2*0.0035;
        var rewardValue = new RewardValue(mileValue2);
        assertEquals(expectedval,rewardValue.getCashValue());
    }
}
