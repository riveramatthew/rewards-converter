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
       RewardValue rewardValue = new RewardValue(6);
       rewardValue.getMilesValue();

       double miles = rewardValue.getCashValue() / RewardValue.MILES_CONVERSION_RATE_TO_CASH;
       assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(6);
        rewardValue.getCashValue();

        double cash = rewardValue.getMilesValue() * RewardValue.MILES_CONVERSION_RATE_TO_CASH;

        assertEquals(cash, rewardValue.getCashValue());
    }
}
