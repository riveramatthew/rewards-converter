public class RewardValue {
    private double cash;
    private final double convert_value = 0.0035;

    public RewardValue(){
        this.cash = 0;
    }
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int cash){
        this.cash = (cash/convert_value);
    }

    public double getCashValue(){
        return this.cash;
    }
    public double getMilesValue(){
        return this.cash*convert_value;
    }

    @Override
    public String toString() {
        return "RewardValue{" +
                "cash=" + cash +
                ", convert_value=" + convert_value +
                '}';
    }
}
