public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double M2C_Conversion_Rate =0.0035;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=cashValue/M2C_Conversion_Rate;
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=cashValue/M2C_Conversion_Rate;
    }

    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return (int) milesValue;
    }

}
