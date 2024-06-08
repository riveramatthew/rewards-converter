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
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {

        double cash=100000.0;
        RewardValue temp1= new RewardValue(cash);
        assertEquals(temp1.getMilesValue(),temp1.cashtomile(cash));
    }

    @Test
    void convert_from_miles_to_cash() {

        int miles=100;
        RewardValue temp2= new RewardValue(miles);
        assertEquals(temp2.getCashValue(),temp2.miletocash(miles));

    }
}
