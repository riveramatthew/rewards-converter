public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cashValue){
        cash = cashValue;
        miles = (int)(cashValue / 0.0035);
    }
    public RewardValue(int milesValue){
        miles = milesValue;
        cash = milesValue * 0.0035;
    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}
