
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
        double cashValue = 100; // Example value
        double conversionRate = 1/0.0035; 
        var rewardValue = new RewardValue(cashValue);
        rewardValue.convertCashToMiles(conversionRate);
        assertEquals(10000, rewardValue.getMilesValue());
}

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // Example value
        double conversionRate = 0.0035;
        var rewardValue = new RewardValue(milesValue);
        rewardValue.convertMilesToCash(conversionRate);
        assertEquals(100, rewardValue.getCashValue());
}

}
