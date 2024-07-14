package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.RewardValue;
import java.util.InputMismatchException;

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


    // lets try 0, negative value, positive value,
    @Test
    void convert_from_cash_to_miles() {

        try {

            {
                double testCash = 0;
                var rewardValue = new RewardValue(testCash);

                int milesExpected = 0;
                assertEquals(milesExpected, rewardValue.getMilesValue());
            }


            {
                double testCash = -12.372;
                var rewardValue = new RewardValue(testCash);

                int milesExpected = 0;
                try {
                    rewardValue.getMilesValue();
                    assert false;
                }

                catch (InputMismatchException e) {
                }

                catch (Exception e){
                    assert false;
                }

            }

            {
                double testCash = 43902.0001;
                var rewardValue = new RewardValue(testCash);

                int milesExpected = 12543428;
                assertEquals(milesExpected, rewardValue.getMilesValue());
            }

        }

        catch (Exception e) {
            assert false;
        }

     assert true;

    }

    @Test
    void convert_from_miles_to_cash() {

        try  {
            {
                int miles = 0;
                var rewardValue = new RewardValue(miles);

                double expectedCash = 0;
                assertEquals(expectedCash, rewardValue.getCashValue());
            }

            {
                int miles = -2;
                var rewardValue = new RewardValue(miles);

                try {
                    rewardValue.getCashValue();
                    assert false;
                }

                catch (InputMismatchException e) {
                }
                catch (Exception e){
                    assert false;
                }
            }

            {
                int miles = 38292;
                var rewardValue = new RewardValue(miles);

                double expectedCash = 134.022;
                assertEquals(expectedCash, rewardValue.getCashValue());
            }
        }

        catch (Exception e) {
            assert false;
        }
    }


}

//Doubts
// how does assert equals compare the statements(especially double).Shouldn't we use Math.abs??
// Why do we need to specify the package??

// Learnings
// assertequals is great for testing . it only escapes when false...
//true, nothing happens, and the program continues executing normally. If it evaluates to false,
// an AssertionError is thrown, which typically indicates a bug in the code.

//using assert statements, we can avoid a whole bunch of if statements....we will just need an outer
// try catch block to catch any assertion error(if any) and return True or False (if there is a boolean return type)

// the @test statement is quite useful