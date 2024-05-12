import java.text.DecimalFormat;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor for cash to miles conversion
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor for miles to cash conversion
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            this.cashValue = milesValue;
            this.milesValue = convertCashToMiles(milesValue);
        }
    }

    // Method to convert cash value to miles
    private double convertCashToMiles(double cashValue) {
        // Conversion rate: 1 dollar = 285.71 miles (0.0035 dollars per mile)
        return cashValue / 0.0035;
    }

    // Method to convert miles value to cash
    private double convertMilesToCash(double milesValue) {
        // Conversion rate: 0.0035 dollars per mile
        return milesValue * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter a cash value to convert to airline miles: ");
        double cashAmount = scanner.nextDouble();

        RewardValue reward = new RewardValue(cashAmount);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Converting $" + cashAmount + " to miles");
        System.out.println("$" + cashAmount + " is worth " + df.format(reward.getMilesValue()) + " miles.");

        // Example conversion from miles to cash
        System.out.println("Please enter a miles value to convert to cash: ");
        double milesAmount = scanner.nextDouble();
        RewardValue reward2 = new RewardValue(milesAmount, true);
        System.out.println(milesAmount + " miles is worth $" + df.format(reward2.getCashValue()) + ".");
    }
}
