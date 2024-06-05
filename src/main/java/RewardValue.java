public class RewardValue {

    double cashValue;

    RewardValue(int miles) {
        cashValue = miles * 0.0035;
    }
    RewardValue(double cash){
        cashValue = cash;
    }

    public double getCashValue(){
         return cashValue;
    }

    public int getMilesValue(){
        return (int)(cashValue / 0.0035);
    }
}
