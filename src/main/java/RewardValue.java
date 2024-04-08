public class RewardValue {
    private double cashValue;
    private double milesValue;

    //constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; //converts cash to miles
    }

    //constructor that accepts a value in miles
    public RewardValue(double value, boolean isMiles) {
        if (isMiles) { //the boolean parameter distinguishes this constructor
            this.milesValue = value;
            this.cashValue = value * 0.0035; //converts miles to cash
        } else {
            this.cashValue = value;
            this.milesValue = value / 0.0035; //converts cash to miles
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
