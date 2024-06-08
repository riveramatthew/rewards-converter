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
        double expectedMiles = (int) (cashValue / 0.0035);
        RewardValue r = new RewardValue(cashValue);
        assertEquals(expectedMiles, r.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 100;
        double expectedCash = milesValue * 0.0035;
        RewardValue r = new RewardValue(milesValue);
        assertEquals(expectedCash, r.getCashValue());
    }
}
