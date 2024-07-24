public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035; // Conversion rate: 1 mile = 0.0035 pounds

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void displayCashValue() {
        System.out.println(milesValue + " miles would get you £" + cashValue);
    }

    public void displayMilesValue() {
        System.out.println("£" + cashValue + " would get you " + milesValue + " miles");
    }
}
