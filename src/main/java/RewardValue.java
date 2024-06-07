public class RewardValue {
    private double cash;
    private double mile;



    public RewardValue(double cash) {
        this.cash = cash;
        this.mile=this.cash*0.0035;
    }

    public double getMilesValue() {
        return this.mile;
    }
    public double getCashValue(){
        return this.cash;
    }
}
