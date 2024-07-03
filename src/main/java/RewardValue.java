class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 1.5; // Example conversion rate: 1 dollar = 1.5 miles

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
