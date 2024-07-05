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
        System.out.println("Converting $" + inputValue + " to miles");
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + inputValue + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue {
    // Declare the fields
    private Double cashValue;

    // Constructor
    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = MilestoCash(milesValue);
    }
    // Getter for cash value
    public Double getCashValue() {
        return cashValue;
    }

    // Method to convert cash to miles
    private Double cashToMiles(Double cashValue) {
        return cashValue / 0.0035;
    }

    private Double MilestoCash(int milesValue) {
        return milesValue * 0.0035;
    }

    // Getter for miles value
    public Double getMilesValue() {
        return cashToMiles(this.cashValue);
    }
}