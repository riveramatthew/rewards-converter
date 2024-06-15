public class RewardValue {
    // Declare the fields
    private Double cashValue;

    // Constructor
    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = MilestoCash(milesValue);
    }
    // Getter for cash value
    public Double getCashValue() {
        return cashValue;
    }

    // Method to convert cash to miles
    private Double cashToMiles(Double cashValue) {
        return cashValue / 0.0035;
    }

    private Double MilestoCash(int milesValue) {
        return milesValue * 0.0035;
    }

    // Getter for miles value
    public Double getMilesValue() {
        return cashToMiles(this.cashValue);
    }
}
