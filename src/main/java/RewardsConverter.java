import java.util.Scanner;
public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String inputValue = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(inputValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("Convegitagitrting $" + inputValue + " to miles");
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + inputValue + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    private double convertToMiles(double cashValue) {
        // Example conversion rate: 1 dollar = 100 miles
        return cashValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
