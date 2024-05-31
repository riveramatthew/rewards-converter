import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        int expectedMilesValue = 1000;// 100 * 0.1 = 1000 miles
        assertEquals(expectedMilesValue, RewardValue.convertCashToMiles(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = 1000.0; // 10000 / 0.1 = 1000 dollars
        assertEquals(expectedCashValue, RewardValue.convertMilesToCash(milesValue));
    }
}
