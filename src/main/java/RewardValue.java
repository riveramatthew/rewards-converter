public class RewardValue {

    // Private variables to store the cash and miles values
    private final double cashValue;

    // Conversion rate constant
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);  // Convert miles to cash
    }

 
    // Private method to convert cash to miles
    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

  // Private method to convert miles to cash
  private static double convertMilesToCash(int milesValue) {
    return (milesValue * MILES_TO_CASH_CONVERSION_RATE);
}

   // Method to get the cash value
   public double getCashValue() {
    return cashValue;
}

// Method to get the miles value
public int getMilesValue() {
    return convertCashToMiles(this.cashValue);
}
