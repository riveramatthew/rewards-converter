import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
        double cashValue = 100; // $100
        double conversionRate = 0.01; // 1 mile = $0.01
        int expectedMilesValue = (int) (cashValue / conversionRate);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // 10,000 miles
        double conversionRate = 0.01; // 1 mile = $0.01
        double expectedCashValue = milesValue * conversionRate;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
