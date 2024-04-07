import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(doubles = {100.0, 500.0, 1000.9, 10000.9}) // Defines multiple test cases with different cash values
    void convert_from_cash_to_miles(double cashValue) {
        int expectedMilesValue = (int) (cashValue / RewardValue.converionrate);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }


    @ParameterizedTest
    @ValueSource(ints = {100, 500, 1000, 10000}) // Defines multiple test cases with different miles values
    void convert_from_miles_to_cash(int milesValue) {
        double expectedCashValue = milesValue * RewardValue.converionrate;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
