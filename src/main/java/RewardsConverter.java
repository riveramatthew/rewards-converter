import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        // Converting cash to miles
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String inputCashValue = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(inputCashValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        RewardValue rewardsValueFromCash = new RewardValue(cashValue);
        rewardsValueFromCash.displayMilesValue();

        // Converting miles to cash
        System.out.println("Please enter a miles value to convert to cash: ");
        String inputMilesValue = scanner.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(inputMilesValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as an integer, exiting");
            return;
        }
        RewardValue rewardsValueFromMiles = new RewardValue(milesValue);
        rewardsValueFromMiles.displayCashValue();
    }
}
