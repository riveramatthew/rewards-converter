public class RewardValue {
    // Declare Variables
    private double valueInCash;
    private double valueInMiles;
    public static final double MILES_TO_CASH_RATE = 0.0035;

    // Declare Constructors
    // Constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.valueInCash = cashValue;
        this.valueInMiles = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles){
            this.valueInMiles = milesValue;
            this.valueInCash = milesValue * MILES_TO_CASH_RATE;
        } else{
            throw new IllegalArgumentException("Use the other constructor for cash Value.");
        }
    }

    // Delare Methods

    // Method to get the cash value
    public double getCashValue(){
        return valueInCash;
    }
    // Method to get the miles value
    public double getMilesValue(){
        return valueInMiles;
    }
}
