public class RewardValue {
   
    private final double MILES_TO_CASH = 0.0035;
    private double cashValue;
    private double milesValue;


    //cash value constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue/MILES_TO_CASH;
    }


    //mile value constructors
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*MILES_TO_CASH;
    }  


    public double getCashValue(){
        return cashValue;
    }    


    public double getMilesValue(){
        return milesValue;
    }


}



