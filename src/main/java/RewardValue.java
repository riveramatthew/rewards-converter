public class RewardValue {
    private double cash;
    private int miles;
    private int toggle;

    public RewardValue(Double cash){
        this.cash = cash;
        this.toggle = 0;
    }
    public RewardValue(int miles){
        this.miles = miles;
        this.toggle = 1;
    }

    public int getMilesValue(){
        return toggle==1?miles:(int) (cash / 0.0035);
    }

    public Double getCashValue(){
        return toggle==0?cash:miles * 0.0035;
    }
}
