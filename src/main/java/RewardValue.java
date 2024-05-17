
public class RewardValue {
    final double cashValue;
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue/0.0035;
    }

    public double convertToCash(int milesValue) {
        return milesValue*0.0035;
    }
}