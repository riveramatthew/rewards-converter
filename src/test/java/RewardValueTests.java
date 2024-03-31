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
    	double cashValue=100;
    	var rewardValue=new RewardValue(cashValue);
    	int expectedMiles=(int)cashValue;
    	assertEquals(expectedMiles,rewardValue.getMilesValue(),"Conversion from cash to miles failed");
    	
//        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue; // Assuming 1 mile = 1 dollar conversion rate
        assertEquals(expectedCash, rewardValue.getCashValue(), "Conversion from miles to cash failed");
    }
}
