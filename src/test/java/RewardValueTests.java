import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        //Initialize the cash value
        double cashValue = 100;
        //Create a new reward value object with the cash value
        var rewardValue = new RewardValue(cashValue);
        //Check if the cash value is equal to the cash value of the reward value object
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
        assert true;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert true;
    }
}
