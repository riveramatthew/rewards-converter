import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void testCashToMilesConversion() {
        // Given
        double cashValue = 100.0;
        double expectedMiles = cashValue / 0.0035; // expected miles

        // When
        RewardValue rewardValue = new RewardValue(cashValue);

        // Then
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.0001); // accurate conversion
    }

    @Test
    void testMilesToCashConversion() {
        // Given
        double milesValue = 10000.0;
        double expectedCash = milesValue * 0.0035; // expected cash

        // When
        RewardValue rewardValue = new RewardValue(milesValue);

        // Then
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // accurate conversion
    }
}
