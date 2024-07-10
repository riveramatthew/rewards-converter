public class RewardValue {
    private double cashValue;
    private double milesValue;

    public static final double milesToCash = 0.0035; //Conversion rate

    //Constructor that accepts a cash value
    public RewardValue(double cashReward){
        this.cashValue = cashReward;
        this.milesValue = cashReward/milesToCash;
    }

    //Constructor that accepts a value in miles
    public RewardValue(int milesReward){
        this.milesValue = milesReward;
        this.cashValue = milesReward * milesToCash;
    }

    //Method that returns a cash value
    public double getCashValue(){
        return cashValue;
    }

    //Method that returns a value in miles
    public double getMilesValue(){
        return milesValue;
    }
}
