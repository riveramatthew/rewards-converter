public class RewardValue {
    private double cashValue;
    private double milesValue;

    //constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; //converts cash to miles
    }

    //constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) { //the boolean parameter distinguishes this constructor
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; //converts miles to cash
        }
    }

    //method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    //method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
