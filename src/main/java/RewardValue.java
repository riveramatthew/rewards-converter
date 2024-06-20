public class RewardValue {

    double cashValue;
    int mileValue;
    // RewardValue must have two constructors: one that accepts a cash value and 
    // one that accepts a value in miles.
    RewardValue(double cash) {
        this.cashValue = cash;
    }

    RewardValue(int miles) {
        this.mileValue = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMileValue() {
        return mileValue;
    }

}
