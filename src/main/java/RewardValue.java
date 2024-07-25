public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double cashVal){
        this.cash = cashVal;
        this.miles = cashToMiles(cashVal);
    }
    public double getCashValue(){
        return this.cash;
    }
    public double getMilesValue(){
        return this.miles;
    }
    public double cashToMiles(double cash){
        return cash / 0.0035;
    }
}