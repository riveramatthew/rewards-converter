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
        double cash = 100;
        RewardValue rw = new RewardValue(cash);
        int miles = (int) (cash / RewardValue.CONVERSIONRATE);
        assertEquals(miles, rw.cashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        RewardValue rw = new RewardValue(miles);
        double cash = miles * RewardValue.CONVERSIONRATE;
        assertEquals(cash, rw.milesToCash());
    }
}
