public class RewardValue {
    double cashValue;
    int miles;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue / 0.0035);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        cashValue = this.miles *= 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return miles;
    }

}

