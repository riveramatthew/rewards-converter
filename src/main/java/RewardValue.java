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

    public double convertCashToMiles(){
        return cash / milesToCash;
    }

    public double convertMilesToCash(){
        return miles*milesToCash;
    }

    public double getCashValue(){
        return cash;

    }

    public double getMilesValue(){
       return miles;

    }

}
