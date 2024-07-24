import java.util.Scanner;

class RewardValue {
    // Conversion rate constants
    private static final double MILES_PER_DOLLAR = 1 / 0.0035;
    private static final double DOLLARS_PER_MILE = 0.0035;

    private double cashValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.cashValue = milesValue * DOLLARS_PER_MILE;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue * MILES_PER_DOLLAR;
    }
}


public class RewardsConverter {
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
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}