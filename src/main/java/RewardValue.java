
public class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(float miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return round(miles * 0.0035, 1);
    }

    public double getMilesValue(){
        return round(cash/0.0035, 1);
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
