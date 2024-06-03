public class RewardValue {

    double milesValue = 0.0;
    double cashValue = 0.0;

    RewardValue(int miles) {
        milesValue = miles;
    }
    RewardValue(double cash){
        cashValue = cash;
    }

    public double getCashValue(){
         cashValue = milesValue * 0.0035;
         return cashValue;
    }

    public double getMilesValue(){
        milesValue = cashValue / 0.0035;
        return milesValue;
    }
}
