
public class rewardvalue {
    private double cashvalue;
    private double milesvalue;
    public rewardvalue(double cashvalue) {
        this.cashvalue = cashvalue;
        this.milesvalue = cashvalue/0.0035;
       }
public  rewardvalue(int milesvalue) {
        this.milesvalue = milesvalue;
        this.cashvalue = cashvalue*0.0035;

    }

    public double getCashvalue() {
        return cashvalue;
    }

    public double getMilesvalue() {
        return milesvalue;
    }
}


