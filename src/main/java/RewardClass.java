public class RewardClass {
    private double cashValue;
    private int milesValue;

    public RewardClass(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardClass(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertToMiles() {
        return (int) (cashValue * 100); // assuming 1 cash unit = 100 miles
    }

    public double convertToCash() {
        return milesValue / 100.0; // assuming 100 miles = 1 cash unit
    }
}