public class RewardValue {
    private final double cash;
    private final int miles;

    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles*0.0035;
    }

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) Math.round(cash/0.0035);
    }

    public int getMilesValue(){
        return this.miles;
    }

    public double getCashValue(){
        return this.cash;
    }
}
