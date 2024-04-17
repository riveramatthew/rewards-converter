public class RewardValue {
//    public static void main(String[] args){
//
//    }
    private double cash;
    private double miles;

    public RewardValue(double val){
        this.cash = val;
        this.miles = val;
    }


//    public RewardValue(double convert) {
//        double new_val = convert;
//    }
    public double getCashValue() {
        return (this.miles*0.0035);
    }
    public double getMilesValue() {
        return (this.cash/0.0035);
    }
}
