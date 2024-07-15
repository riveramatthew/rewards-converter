public class RewardValue {
    
private double cash;
private int miles;
public static final double CONVERSION_RATE= 0.0035;

    public RewardValue(double cash){
    this.cash = cash;
    this.miles = (int) (cash / CONVERSION_RATE);
    
    }
    public RewardValue(int miles){
    this.miles = miles;
    this.cash = miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return this.cash;
    }
    public double getMilesValue(){
        return this.miles;
    }
}

