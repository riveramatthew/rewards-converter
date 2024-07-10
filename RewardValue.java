public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double c){
        cash = c;
        miles = cash/0.0035;
    }
    public RewardValue(int m){
        miles = m;
        cash = miles * 0.0035;
    }
    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return (int)miles;
    }
}
