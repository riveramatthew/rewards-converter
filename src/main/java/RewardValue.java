public class RewardValue {

    private double cashValue;
    private double milesValue;
    private static final double rate = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue){
        this.cashValue = toCash(milesValue);
    }

    // Method that returns cash value
    public double toCash(int milesValue){
        return milesValue * rate;
    }

    // Method that returns miles value
    public int toMiles(double cashValue){
        return (int) (cashValue / rate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return toMiles(this.cashValue);
    }
}
