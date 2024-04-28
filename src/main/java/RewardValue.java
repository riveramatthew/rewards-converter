import java.util.*;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    public RewardValue(double value, boolean isMiles) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = Math.round(value / 0.0035 * 100.0) / 100.0;
        } else {
            this.cashValue = value;
            this.milesValue = Math.round(value * 0.0035 * 100.0) / 100.0;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double convertCashToMiles() {
        return cashValue * 0.0035;
    }

    public double convertMilesToCash() {
        return milesValue / 0.0035;
    }
}
