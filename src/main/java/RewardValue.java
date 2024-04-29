public class RewardValue {
    // This class is used to convert cash value to miles value
    //private instance variables to store cash value and miles
    private double cashValue; //represent the cash value of the reward
    private int milesValue; //represent the miles value of the reward

    //constructor accepting cash value
    public RewardValue(double cashValue) {
        //Set the cash value provided as an input
        this.cashValue = cashValue;
        //Calculates the miles value based on the cash value
        this.milesValue = (int) (cashValue /0.0035); //converts cash value to miles value
    }

    //constructore accepting miles value
    public RewardValue(int milesValue) {
        //Set the miles value provided as an input
        this.milesValue = milesValue;
        //Calculates the cash value based on the miles value
        this.cashValue = milesValue * 0.0035; //converts miles value to cash value
    }
    //method to get the miles value
    public double getMilesValue() {
        return cashValue * 100;
    }

    //method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

}
