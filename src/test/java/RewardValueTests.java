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
        double cash = 50.0;
        var rewards = new RewardValue(cash);
        double miles = rewards.getMilesValue();
        double realcash = 0.0035 * miles;
        assertEquals(cash, realcash);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 50;
        var rewards = new RewardValue(miles);
        double cash = rewards.getCashValue();
        int realmiles = (int)(cash / 0.0035);
        assertEquals(miles,realmiles);
    }
}
