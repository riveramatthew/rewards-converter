import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    public static class RewardValue {
        private double cashValue;
        private int milesValue;
        private static final double MILES_TO_CASH_CONVERSION_RATE = 0.01;

        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        }

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
    }

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
        double conversionRate = 0.01; // Assume $0.01 per mile
        int expectedMiles = (int) (cashValue / conversionRate);

        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double conversionRate = 0.01; // Assume $0.01 per mile
        double expectedCash = milesValue * conversionRate;

        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001); // Allow small margin for floating point comparison
    }
}
