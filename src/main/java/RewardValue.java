class RewardValue {

    private double cashValue;
    private int milesValue;
    private static final double MILE_TO_CASH_RATE = 0.0035;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILE_TO_CASH_RATE);
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILE_TO_CASH_RATE;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

}