public class RewardValue {
    private double cashValue;
    private int distanceinMiles;
    public static final double conversion_rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int distanceinMiles)
    {
        this.distanceinMiles = distanceinMiles;
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / conversion_rate);
    }

    private double convertToCash(int milesValue) {
        return milesValue * conversion_rate;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue()
    {
        return convertToMiles(this.cashValue);
    }
}
