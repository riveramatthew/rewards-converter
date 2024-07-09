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
        double cash = 150.55;
        double CASH_TO_MILES_CONVERSION = 1 / 0.0035;
        int expectedMiles = (int) (cash * CASH_TO_MILES_CONVERSION);
        var rewardValue = new RewardValue(cash);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 5800;
        double MILES_TO_CASH_CONVERSION = 0.0035;
        double expectedCash = miles * MILES_TO_CASH_CONVERSION;
        var rewardValue = new RewardValue(miles);
        assertEquals(expectedCash, rewardValue.getCashValue());

    }
}
