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
       double cashvalue = 10000;
       double milevalue = cashvalue/0.0035;
       var rewardvalue =  new RewardValue(cashvalue);
       assertEquals(milevalue,rewardvalue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
    	int milesValue = 10000;
        double expectedCash = milesValue * 0.0035; // Based on the conversion logic
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}
