public class RewardValue {
    double value;
    RewardValue(double cashValue){
        value = cashValue;
    }
    RewardValue(int milesValue){
        value = milesValue;
    }
    double getCashValue(){
        double rewardsValue = 0.0035*value;
        return rewardsValue;
    }
    int getMilesValue(){
        double rewardsValue = (1.0/0.0035)*value;
        return (int) rewardsValue;
    }    
}
