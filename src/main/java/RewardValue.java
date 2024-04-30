public class RewardValue {
    private int cashValue;
    private double distanceinMiles;

    public RewardValue(int cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double distanceinMiles)
    {
        this.distanceinMiles = distanceinMiles;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue()
    {
        return distanceinMiles * 0.0035;
    }
}
