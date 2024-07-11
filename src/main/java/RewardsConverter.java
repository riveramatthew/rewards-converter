import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
//        System.out.println("Please enter a cash value to convert to airline miles: ");
        System.out.println("Please enter airline miles value to convert to cash: ");
        var input_value = scanner.nextLine();
//        double cashValue;
        int miles;
        try {
//            cashValue = Double.parseDouble(input_value);
            miles = Integer.parseInt(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
//        var rewardsValue = new RewardValue(cashValue);
        var rewardsValue = new RewardValue(miles);
//        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        System.out.println("Miles:" + input_value + " is worth " + rewardsValue.getCashValue() + " Cash");
    }
}