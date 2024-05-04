package test.java;

import org.junit.jupiter.api.Test;

import main.java.RewardValue;

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
    	int milesValue = 100000;
    	double cashValue = 350;
    	var rewardValue = new RewardValue(cashValue);
    	assertEquals(milesValue, rewardValue.getMilesValue());
    	
    	
    	
    }

    @Test
    void convert_from_miles_to_cash() {
       int cashValue = 350;
       int milesValue = 100000;
       var rewardValue = new RewardValue(milesValue);
       assertEquals(cashValue, rewardValue.getCashValue());
       
    }
}
