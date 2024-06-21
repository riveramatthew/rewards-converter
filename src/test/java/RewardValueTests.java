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
        // Copy from Create cash value, write milesValue convert to (milesV is Int), Var + AssertEQ
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int Convert_to_milesValue = (int)(cashValue / RewardValue.miles_to_cash_rate);
        assertEquals(Convert_to_milesValue,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        // Copy from Create milesValue, write cashValue convert to , Var + AssertEQ
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double Convert_to_cashValue = milesValue * RewardValue.miles_to_cash_rate;
        assertEquals(Convert_to_cashValue,rewardValue.getCashValue());
    }
}
