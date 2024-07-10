public class RewardValue {
    public double cash;
    public double miles;


    public void setMiles(double milesValue) {
        miles = milesValue;
    }

    public void setCash(double cashValue) {
        cash = cashValue;
    }

    public RewardValue(double cashValue) {
        setCash(cashValue);
        setMiles(cashValue/0.0035);

    }

    public RewardValue(int milesValue){
        setMiles(milesValue);
        setCash(milesValue*0.0035);

    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
//RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//RewardValue must convert from miles to cash at a rate of 0.0035.