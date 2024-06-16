import java.text.DecimalFormat;

public class RewardValue {
    private double cashValue, milesValue;
    private static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return Double.parseDouble(new DecimalFormat("#.000").format(milesValue*MILES_TO_CASH));
    }

    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH);
    }

    public static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH;
    }
}
