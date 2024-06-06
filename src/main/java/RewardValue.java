public class RewardValue {

    final double milesToCash = 0.0035;
    double cash = 0;
    double miles = 0;
    
    public RewardValue(double cash){
        this.cash = cash;

    }

    public RewardValue(int miles){
        this.miles = miles;

    }

    public double getCashValue(){
        return miles * milesToCash;

    }

    public double getMilesValue(){
        return cash / milesToCash;

    }

}
