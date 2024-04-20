import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
        double cashValue = 10.0;
        double CONVERSION_RATE = 0.0035; // Conversion rate (miles per dollar)
        int expectedMiles = (int) Math.round(cashValue / CONVERSION_RATE);
    
        RewardValue reward = new RewardValue(cashValue);
        int actualMiles = reward.getMilesValue(); // This might not directly calculate miles
    
    
        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        
        int milesValue=100;
        double CONVERSION_RATE = 0.0035;

        double expectedcash = milesValue * CONVERSION_RATE;

        RewardValue reward = new RewardValue(milesValue);
        double actualcash = reward.getCashValue();

        assertEquals(expectedcash, actualcash);


    }
}
