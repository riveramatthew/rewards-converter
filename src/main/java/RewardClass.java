public class RewardClass {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
        System.out.println("Initialized with cash: " + cashValue + "miles: " + this.milesValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
        System.out.println("Initialized with miles:" + milesValue + "cash:" + this.cashValue);;
    }

    public double getCashValue() {
        System.out.println("Returning cash value:" + cashValue);
        return cashValue;
    }
    public int getMilesValue() {
        int roundedMilesValue = (int) Math.round(milesValue);
        System.out.println("Returning miles value: ") +roundedMilesValue);
        return roundedMilesValue;
    }
}
