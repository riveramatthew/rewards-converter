import java.util.Scanner;

class RewardValue {
    double cashValue;

    // Constructor to initialize cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Method to convert cashValue to miles
    public double getMilesValue() {
        return cashValue * 100;  // Assuming 1 dollar = 100 miles
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
        System.out.println("Converting $" + input_value + " to miles");
        var rewardValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardValue.getMilesValue() + " miles");
    }
}
