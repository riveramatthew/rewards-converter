import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        int milesValue;
        boolean isMatch = false;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        try {
            milesValue = Integer.parseInt(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a int, exiting");
            return;
        }

            System.out.println("converting $" + input_value + " to miles");
            var rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

    }
}