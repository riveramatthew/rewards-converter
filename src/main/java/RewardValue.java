public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double conversion = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversion;
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversion;
    }


    public double getCashValue() {
        return cashValue;
    }

    
    public int getMilesValue() {
        return (int)milesValue;
    }
}
