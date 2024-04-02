public class RewardValue {
    double cash;
        double miles;
    RewardValue(double cash){
this.cash=cash;
    }
double getMilesValue(){
       miles= (double)(cash*0.0035);
       return miles;
}
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles=miles;
    }
}
