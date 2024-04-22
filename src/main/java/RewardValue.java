public class RewardValue {
    private double cashValue;

    //Constructor when cashValue is passed
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    //Constructor when milesValue is passed
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    //Getter for cashValue
    public double getCashValue(){
        return cashValue;
    }

    //Getter for milesValue
    public int getMilesValue(){
        return convertToMiles(cashValue);
    }

    //Method to convert milesValue into cashValue
    private static double convertToCash(int milesValue){
        return milesValue * 0.0035;
    }

    //Method to convert cashValue into milesValue
    private static int convertToMiles(double cashValue){
        return (int) (cashValue / 0.0035);
    }



   
}
