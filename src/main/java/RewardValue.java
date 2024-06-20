public class RewardValue{

    double cashValue;
    double miles;

    RewardValue(double cash) {    
        cashValue = cash;
        miles = cashValue * 0.0035;
    }

    double getMilesValue()
    {
        return miles;
    }

    double getCashValue()
    {
        return cashValue;
    }
}
