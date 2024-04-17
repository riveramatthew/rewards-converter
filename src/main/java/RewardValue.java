public class RewardValue {
//    public static void main(String[] args){
//
//    }
    private double cash;
    private double miles;

    public RewardValue(double val){
        this.cash = val;
    }

    public RewardValue(int val){
        this.miles = val;
    }


    public double getCashValue() {
        return (this.miles*0.0035);
    }
    public int getMilesValue() {
        return (int)(this.cash/0.0035);
    }
}
