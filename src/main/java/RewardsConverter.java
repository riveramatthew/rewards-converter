import java.util.Scanner;

class RewardValue {
    // Conversion rate constants
    public static final double MILES_PER_DOLLAR = 1 / 0.0035;
    public static final double DOLLARS_PER_MILE = 0.0035;

    private final double cashValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Converts cash to miles
    private static int convertToMiles(double cashValue) {
        return (int) Math.round(cashValue * MILES_PER_DOLLAR);
    }

    // Converts miles to cash
    private static double convertToCash(int milesValue) {
        return milesValue * DOLLARS_PER_MILE;
    }

    // Returns the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Returns the miles value
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
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