import java.util.Scanner;

class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Potentially calculate milesValue based on conversion rate here
        this.milesValue = (int) (cashValue * getConversionRate()); // Assuming conversion rate is a constant
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Potentially calculate cashValue based on conversion rate here
        this.cashValue = milesValue / getConversionRate();
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private static double getConversionRate() {
        // This method could return the constant conversion rate (0.0035)
        return 0.0035;
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
