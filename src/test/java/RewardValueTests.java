import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.01;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 100;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue * CASH_TO_MILES_CONVERSION_RATE);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double convertMilesToCash() {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public int convertCashToMiles() {
        return (int) (cashValue * CASH_TO_MILES_CONVERSION_RATE);
    }
}

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
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue * 100); // Using the conversion rate of 1 cash = 100 miles
        assertEquals(expectedMilesValue, rewardValue.convertCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.01; // Using the conversion rate of 1 mile = 0.01 cash
        assertEquals(expectedCashValue, rewardValue.convertMilesToCash());
    }
}