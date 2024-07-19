//RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue {

    private double cash;
    private int milesValue;

    public RewardValue(double cashValue) {
        // TODO Auto-generated constructor stub
        cash = cashValue;
    }

    public RewardValue(int milesValue) {
        // TODO Auto-generated constructor stub
        milesValue = milesValue;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        milesValue = (int) (cash * (0.0035));
        return milesValue;
    }

}
