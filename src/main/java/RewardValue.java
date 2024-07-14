package main.java;

public class RewardValue {
    private double cashVal = 0;
    private int milesVal = 0;

    public RewardValue(double cashVal){
        this.cashVal = cashVal;
    }

    public RewardValue(int milesVal){
        this.milesVal = milesVal;
    }

    public double getCashValue(){
        return milesVal*0.0035 + cashVal;
    }

    public int getMilesValue(){
        return  (int)(cashVal/0.0035) + milesVal;
    }
}
