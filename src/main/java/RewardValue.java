package main.java;

public class RewardValue {

    // variable initializations
    private double cashVal = 0;
    private int milesVal = 0;
    private static final double convRate = 0.0035;

    // constructors
    public RewardValue(double cashVal){
        this.cashVal = cashVal;
    }

    public RewardValue(int milesVal){
        this.milesVal = milesVal;
    }

    //helper methods
    private static int cashToMiles(double cash){
        return (int)(cash/convRate);
    }

    private static double  milesToCash(int miles){
        return miles*convRate;
    }


    // accessor methods
    public double getCashValue(){
        return milesToCash(milesVal) + cashVal;
    }

    public int getMilesValue(){
        return cashToMiles(cashVal)  + milesVal;
    }
}

// aim to separate the functionalities and declare constants.