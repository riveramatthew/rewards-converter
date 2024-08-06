

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }
    
    
    public double convert_from_cash_to_miles(double cashValue) {
    	milesValue = cashValue/MILES_TO_CASH_RATE;
    	
		return milesValue;
    	
    }
    public double convert_from_miles_to_cash(double milesValue) {
    	cashValue = milesValue*MILES_TO_CASH_RATE;
    	return cashValue;
    }
}
