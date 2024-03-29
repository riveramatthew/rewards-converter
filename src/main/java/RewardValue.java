public class RewardValue {
    
    public final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private int miles;
    
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.miles = convertToMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = convertToCash(miles);
    }

    double getCashValue() {
        return this.cashValue;
    }
    
    int getMilesValue() {
        return this.miles;
    }

    double convertToCash(int miles) {
        return miles * MILES_TO_CASH_RATE;
    }

    int convertToMiles(double cash) {
        return (int) (cash / MILES_TO_CASH_RATE);
    }


}
