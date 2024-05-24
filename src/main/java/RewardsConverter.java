import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = converttoCash(milesValue);
    }

    private static int converttoMiles(double cashValue) {
        return (int) (cashValue/CONVERSION_RATE);
    }

    private static double converttoCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return converttoMiles(this.cashValue);
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