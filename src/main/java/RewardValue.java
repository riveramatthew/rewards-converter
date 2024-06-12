public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a miles value
    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        } else {
            // Fallback if boolean flag is set incorrectly, though ideally should not reach here
            this.cashValue = milesValue;
            this.milesValue = cashValue / 0.0035;
        }
    }
    
    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}
