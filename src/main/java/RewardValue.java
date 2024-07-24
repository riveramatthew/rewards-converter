public class RewardValue{
    private double cashvalue;
    private int milesvalue;
    private final double MILES_TO_CASH_CONVERT_RATE = 0.0035;
//constructor that takes cash value
    public RewardValue(double cash){
        this.cashvalue = cash;
        this.milesvalue = (int) (cashvalue/MILES_TO_CASH_CONVERT_RATE);
    }
//constructor that takes miles value
    public RewardValue(int miles){
        this.milesvalue = miles;
        this.cashvalue = (double) (milesvalue*MILES_TO_CASH_CONVERT_RATE);
    }
//this method returns cash value 
    public double getCashValue(){
        return cashvalue;
    }
//this method returns miles value
    public int getMilesValue(){
        return milesvalue;
    }
}
