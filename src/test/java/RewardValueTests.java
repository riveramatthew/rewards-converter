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
        var rewardValue = new RewardValue(milesValue, true); // Indicate that milesValue is in miles
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double expectedMilesValue = cashValue / 0.0035; // Conversion rate: 0.0035 dollars per mile
        RewardValue rewardValue = new RewardValue(cashValue);
        double actualMilesValue = rewardValue.getMilesValue();
        assertEquals(expectedMilesValue, actualMilesValue, 0.01); // Provide a delta for precision
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        double expectedCashValue = milesValue * 0.0035; // Conversion rate: 0.0035 dollars per mile
        RewardValue rewardValue = new RewardValue(milesValue, true); // Indicate that milesValue is in miles
        double actualCashValue = rewardValue.getCashValue();
        assertEquals(expectedCashValue, actualCashValue, 0.01); // Provide a delta for precision
    }
}
