class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return convertToMiles(this.cash);
    }
}
