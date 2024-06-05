public class RewardValue {

    // Conversion rate
    public final double MILES_TO_CASH = 0.0035;

    // Instance variables
    private double CashValue = 0.0;
    private int MilesValue = 0;

    // Constructor that accepts a cash value
    public RewardValue(double CashValue) {
        this.CashValue = CashValue;
        this.MilesValue = convertCashToMiles(CashValue);
    }

    // Constructor that accepts mile value
    public RewardValue(int MilesValue) {
        this.MilesValue = MilesValue;
        this.CashValue = convertMilesToCash(MilesValue);
    }

    // Method to convert cash to miles
    private int convertCashToMiles(double CashValue){
        return (int) (CashValue / MILES_TO_CASH);
    }

    // Method to convert miles to cash
    private double convertMilesToCash(int MilesValue) {
        return MilesValue * MILES_TO_CASH;
    }

    // Method to return CashValue of RewardValue
    public double getCashValue() {
        return this.CashValue;
    }

    // Method to return MilesValue of RewardValue
    public int getMilesValue() {
        return this.MilesValue;
    }
}
