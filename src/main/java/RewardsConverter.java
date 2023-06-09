import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        int milesValue = 282;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        //rewardsValue.setCashValue(cashValue);
        //System.out.println("$" + input_value + " is worth " + rewardsValue.convertFromCashToMiles() + " miles");

        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        System.out.println("___________________________________");
        //rewardsValue.setMilesValue(rewardsValue.convertFromCashToMiles());
        System.out.println("converting " + rewardsValue.getMilesValue() + " miles to cash");
        System.out.println("Your cash rewards value for " + rewardsValue.getMilesValue() + " miles is: $" + rewardsValue.getCashValue() );

        System.out.println("___________________________");
        var tester = new RewardValue(milesValue);
       System.out.println(tester.getMilesValue());
        System.out.println(tester.getCashValue());

    }
}