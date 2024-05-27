/* author: Nandika Taneja  tanejanandika@gmail.com*/
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

    /*test conversion from cash value to miles value*/
    @Test
    void convert_from_cash_to_miles() {
        double cash=100;
        int mile= (int) (cash/0.0035);
        var rewardValue=new RewardValue(cash);
        assertEquals(mile,rewardValue.getMilesValue());

        //assert false;
    }

    /*test conversion from miles value to cash value*/
    @Test
    void convert_from_miles_to_cash() {
        int mile=100;
        double cash= mile*0.0035;
        var rewardValue=new RewardValue(mile);
        assertEquals(cash,rewardValue.getCashValue());
        //assert false;
    }
}
