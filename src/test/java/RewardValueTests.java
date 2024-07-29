import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Nested
    class CashToMilesTests {

        @Test
        void create_with_cash_value() {
            double cashValue = 100;
            var rewardValue = new RewardValue(cashValue);
            assertEquals(cashValue, rewardValue.getCashValue());
        }

        @Test
        void should_convert_cash_to_miles() {
            double cashValue = 100;
            int milesValue = 28571;
            RewardValue rewardValue = new RewardValue(cashValue);

            assertEquals(milesValue, rewardValue.getMilesValue());
        }

        @Test
        void should_convert_zero_cash_to_zero_miles() {
            double cashValue = 0;
            int milesValue = 0;
            RewardValue rewardValue = new RewardValue(cashValue);

            assertEquals(milesValue, rewardValue.getMilesValue());
        }

        @Test
        void should_convert_negative_cash_to_negative_miles() {
            double cashValue = -100;
            int milesValue = -28571;
            RewardValue rewardValue = new RewardValue(cashValue);

            assertEquals(milesValue, rewardValue.getMilesValue());
        }

        @Test
        void should_convert_decimal_cash_value_to_miles() {
            double cashValue = .0035;
            int milesValue = 1;
            RewardValue rewardValue = new RewardValue(cashValue);

            assertEquals(milesValue, rewardValue.getMilesValue());
        }

    }

    @Nested
    class MilesToCashTests {

        @Test
        void create_with_miles_value() {
            int milesValue = 10000;
            var rewardValue = new RewardValue(milesValue);

            assertEquals(milesValue, rewardValue.getMilesValue());
        }

        @Test
        void should_convert_from_miles_to_cash() {
            int milesValue = 10000;
            double cashValue = 35;
            RewardValue rewardValue = new RewardValue(milesValue);

            assertEquals(cashValue, rewardValue.getCashValue());
        }

        @Test
        void should_convert_from_zero_miles_to_zero_cash() {
            int milesValue = 0;
            double cashValue = 0;
            RewardValue rewardValue = new RewardValue(milesValue);

            assertEquals(cashValue, rewardValue.getCashValue());
        }

        @Test
        void should_convert_negative_miles_to_negative_cash() {
            int milesValue = -10000;
            double cashValue = -35;
            RewardValue rewardValue = new RewardValue(milesValue);

            assertEquals(cashValue, rewardValue.getCashValue());
        }

        @Test
        void should_convert_from_miles_to_decimal_cash() {
            int milesValue = 1;
            double cashValue = .0035;
            RewardValue rewardValue = new RewardValue(milesValue);

            assertEquals(cashValue, rewardValue.getCashValue());
        }

    }

}
