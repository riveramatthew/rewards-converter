public class RewardValue {
    private double cash;
    private int mile;


    public RewardValue(double cash) {
        this.cash = cash;
        this.mile = (int)(cash*0.0035);
    }
    public RewardValue(int mile) {
        this.mile=mile;
        this.cash= (mile/0.0035);

    }

    public double getMilesValue() {
        return this.mile;
    }
    public double getCashValue(){
        return this.cash;
    }
    public double cashtomile(double cash){
        RewardValue temp= new RewardValue(cash);
        return temp.getMilesValue();
    }
    public double miletocash(int mile){
        RewardValue temp= new RewardValue(mile);
        return temp.getCashValue();
    }
}
