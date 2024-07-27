import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private static final double EPSILON = 1e-6; // Tolerance for floating-point comparisons

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), EPSILON, "Cash value should match.");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), EPSILON, "Miles value should match.");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), EPSILON, "Conversion from cash to miles failed.");
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue(), EPSILON, "Conversion from miles to cash failed.");
    }
}
