public class RewardValue {
    double cash_value;
    double mileage;

    public RewardValue(double cash_value) {
        this.cash_value = cash_value;
        this.mileage = cash_value / 0.0035;
    }

    public RewardValue(int miles) {
        this.mileage = miles;
        this.cash_value = miles * 0.0035;
    }

    public double getCashValue(){
        return this.cash_value;
    }

    public double getMilesValue(){
        return this.mileage;
    }
}
