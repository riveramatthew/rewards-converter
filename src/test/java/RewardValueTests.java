import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardClass(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardClass(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardClass(cashValue);
        int milesValue = rewardValue.convertToMiles();
        assertEquals(10000, milesValue); // assuming 1 cash unit = 100 miles
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardClass(milesValue);
        double cashValue = rewardValue.convertToCash();
        assertEquals(100, cashValue, 0.01); // assuming 100 miles = 1 cash unit
    }
}