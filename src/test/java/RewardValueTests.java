package ForageIntern;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Rewardsconverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("Converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}


class RewardValueTests {

    @Test
    void testCashToMilesConversion() {
        double cashValue = 100.0;
        RewardValue reward = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, reward.getMilesValue(), 0.001);
    }

    @Test
    void testMilesToCashConversion() {
        int milesValue = 1000;
        RewardValue reward = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, reward.getCashValue(), 0.001);
    }

    @Test
    void testGetCashValue() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0, reward.getCashValue());
    }

    @Test
    void testGetMilesValue() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0 / 0.0035, reward.getMilesValue(), 0.001);
    }
}
