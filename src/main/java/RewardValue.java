public class RewardValue {
    // This class is used to convert cash value to miles value
    //private instance variables to store cash value and miles
    private double cashValue; //represent the cash value of the reward
    private int milesValue; //represent the miles value of the reward

    //constructor accepting cash value
    public RewardValue(double cashValue) {
        //Set the cash value provided as an input
        this.cashValue = cashValue;
    }
        public RewardValue(int milesValue) {
        //Calculates the miles value based on the cash value
        this.milesValue =milesValue;
    }

    //getter method to get the cash value
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }

}
