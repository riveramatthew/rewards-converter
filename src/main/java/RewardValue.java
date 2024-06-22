public class RewardValue {
    private double cashValue;
    private static final double MILES_TO_CASH = 0.0035; //the rate does not change for now...

    public RewardValue(double cashValue){ //accepts a value in cash
        this.cashValue = cashValue;
    }

    public RewardValue (int milesValue) { //accepts a value in miles
        this.cashValue = convertToCash(milesValue);
    }

    public static int convertToMiles (double cashValue) {
        return (int)(cashValue / MILES_TO_CASH);
    }

    public static double convertToCash (int milesValue) {
        return milesValue * MILES_TO_CASH;
    }

    public double getCashValue() { //returns the cash value of the RewardValue

        return cashValue;
    }

    public double getMilesValue() { //returns how many miles the RewardValue is worth
        return convertToMiles(this.cashValue);
    }
}
