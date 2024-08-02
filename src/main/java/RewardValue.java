public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(){
        this.cash = 0;
        this.miles = 0;
    }
    public RewardValue( double cash){
        this.cash = cash;
    }
    public RewardValue( int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return this.cash;
    }
    public double getMilesValue(){
        return this.cash * 0.0035;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "RewardValue{" +
                "cash=" + cash +
                ", miles=" + miles +
                '}';
    }
}
