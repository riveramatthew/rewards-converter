public class RewardValue {
    private Double cash;
    private int miles;

    public RewardValue(Double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

    public int getMilesValue(){
        return (int) (cash / 0.0035);
    }

    public Double getCashValue(){
        return miles * 0.0035;
    }
}
