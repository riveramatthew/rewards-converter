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
        assertEquals(milesValue, rewardValue.getMilesValue() * 2.0, 0.01);
    }

    @Test
    void convert_from_cash_to_miles() {
        // Define the conversion rate (e.g., 1 cash unit = 0.5 miles)
        double conversionRate = 0.5;

        // Define the cash value
        double cashValue = 100.0;

        // Create a RewardValue object with the cash value
        var rewardValue = new RewardValue(cashValue);

        // Calculate the expected miles
        double expectedMiles = cashValue * conversionRate;

        // Convert to miles
        double actualMiles = rewardValue.getMilesValue();

        // Assert that the conversion is accurate
        assertEquals(expectedMiles, actualMiles, 0.01); // Allowing a small delta for floating-point precision
    }

    @Test
    void convert_from_miles_to_cash() {
        // Define the conversion rate (e.g., 1 mile = 2 cash units)
        double conversionRate = 2.0;

        // Define the miles value
        double milesValue = 50.0;

        // Create a RewardValue object with the miles value
        var rewardValue = new RewardValue(milesValue);

        // Calculate the expected cash
        double expectedCash = milesValue * conversionRate;

        // Convert to cash
        double actualCash = rewardValue.getCashValue() * conversionRate;

        // Assert that the conversion is accurate
        assertEquals(expectedCash, actualCash, 0.01); // Allowing a small delta for floating-point precision
    }

}
