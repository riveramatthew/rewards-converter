public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double RATE = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double convert_from_miles_to_cash(){
        return milesValue * RATE;
    }
    public double convert_from_cash_to_miles(){
        return cashValue / RATE;
    }

}