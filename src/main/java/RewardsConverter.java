import flow.java.RewardValue;
import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        System.out.println("Please enter a cash value to convert to airline miles: ");
        var inputCashValue = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(inputCashValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        var rewardValueFromCash = new RewardValue(cashValue);
        System.out.println("$" + inputCashValue + " is worth " + rewardValueFromCash.getMilesValue() + " miles");

        System.out.println("Please enter a miles value to convert to cash: ");
        var inputMilesValue = scanner.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(inputMilesValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as an integer, exiting");
            return;
        }
        var rewardValueFromMiles = new RewardValue(milesValue);
        System.out.println(milesValue + " miles is worth $" + rewardValueFromMiles.getCashValue());
    }
}
