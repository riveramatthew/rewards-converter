public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double TO_CASH = 0.0035;
    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int mileValue) {
        this.milesValue = mileValue;
    }


    private double convertToMiles()
    {
        return this.cashValue / this.TO_CASH;
    }
    private double convertToCash()
    {
        return this.milesValue * this.TO_CASH;
    }
    public double getCashValue() {
        return this.convertToCash();
    }
    public double getMilesValue() {
        return this.convertToMiles();
    }
}
