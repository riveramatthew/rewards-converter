import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void createWithCashValue() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value should match the value used to create RewardValue.");
    }

    @Test
    void createWithMilesValue() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value should match the value used to create RewardValue.");
    }

    @Test
    void convertFromCashToMiles() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.0001, "Conversion from cash to miles is incorrect.");
    }

    @Test
    void convertFromMilesToCash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001, "Conversion from miles to cash is incorrect.");
    }
}
