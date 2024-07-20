public class RewardValue {
    private final double value;

    RewardValue(double value){
        this.value=value;
    }
    public double getCashValue() {
        return this.value/0.0035;
    }

    public double getMilesValue() {
        return this.value*0.0035;
    }
}
