import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value should be correctly initialized.");
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 15000.0;
        var rewardValue = new RewardValue(milesValue, true); // Use boolean to specify miles
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value should be correctly initialized.");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200.0;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue * 1.5; // Expected conversion rate
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01, "Cash to miles conversion is incorrect.");
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 3000.0;
        var rewardValue = new RewardValue(milesValue, true); // Specify that the value is in miles
        double expectedCash = milesValue * 0.0035; // Expected conversion rate
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01, "Miles to cash conversion is incorrect.");
    }
}
