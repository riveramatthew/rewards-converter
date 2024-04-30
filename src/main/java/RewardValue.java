public class RewardValue {
    double cashValues;
    double miles;
    public RewardValue(double cashValues){
        this.cashValues = cashValues;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cashValues;
    }

    public double getMilesValue(){
        miles = cashValues * 0.0035;
        return miles;
    }
}
