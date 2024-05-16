public class RewardValue {
    private final double cash;
    private final double miles;

    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles*0.0035;
    }

    RewardValue(double cash){
        this.cash = cash;
        this.miles = cash/0.0035;

    }

    public double getMilesValue(){
        return  miles;
    }
    public double getCashValue(){return cash;}
}
