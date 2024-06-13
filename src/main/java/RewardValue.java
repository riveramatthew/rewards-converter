public class RewardValue {

    private double cashValue;
    private double milesValue;
    private double rate = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / rate;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, double rate){
        this.milesValue = milesValue;
        this.rate = rate;
        this.cashValue = milesValue * rate;
    }

    // Method that returns cash value
    public double getCashValue(){
        return cashValue;
    }

    // Method that returns miles value
    public double getMilesValue(){
        return milesValue;
    }
}
