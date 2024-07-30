public class RewardValue {
    private double cashvalue;
    public static double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashvalue){
        this.cashvalue = cashvalue;
    }
    public RewardValue(int milesvalue){
        this.cashvalue = convertToCash(milesvalue);
    }
    private static int convertToMiles(double cashvalue){
        return (int) (cashvalue / MILES_TO_CASH_RATE);
    }
    private static double convertToCash(int milesvalue){
        return milesvalue * MILES_TO_CASH_RATE;
    }
    public double getCashValue(){
        return cashvalue;
    }
    public double getMilesValue(){
        return convertToMiles(this.cashvalue);
    }
}
