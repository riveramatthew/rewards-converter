import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    //Created by Stephanie Bernades
    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    //Created by Stephanie Bernades
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000.00;
        int expectedMiles = (int)(cashValue / 0.0035);
        var milesValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, milesValue.convertCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 100;
        double expectedCashValue = (double)(milesValue * 0.0035);
        var cashValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, cashValue.convertMilesToCash());
    }
}
