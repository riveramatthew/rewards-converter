import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cash = 100;
        var rewardValue = new RewardValue(cash);
        assertEquals(cash, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int miles = 10000;
        var rewardValue = new RewardValue(miles);
        assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 100;
        int expectedMiles = (int) (cash / RewardValue.milesToCash);
        var rewardValue = new RewardValue(cash);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        double expectedCash = miles * RewardValue.milesToCash;
        var rewardValue = new RewardValue(miles);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

