public class RewardValue {
    private final double cashvalue;
    public static final double CONVERSION_FACTOR= 0.0035;
    RewardValue(double cashvalue){
        this.cashvalue=cashvalue;
    }
    RewardValue(int milesvalue){
       this.cashvalue=milesvalue*CONVERSION_FACTOR;
    }
    public double getCashValue(){
        return cashvalue;
    }
    public int getMilesValue(){
       return (int) (cashvalue/CONVERSION_FACTOR);
    }
}
