/* 
public class RewardValue {
    private double cashValue;
    private double miles;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(var miles){
        this.miles=miles;
    }
}
*/

public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    private double milesToCash(double miles) {
        return miles * 0.0035;
    }

    
}

