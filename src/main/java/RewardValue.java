public class RewardValue {

    double myCashValue;

    double MILES_TO_CASH_RATE = .0035;

    public RewardValue(double cashValue) {
        this.myCashValue = cashValue;
    }

    public RewardValue(int myMiles) {
        this.myCashValue = milesToCash(myMiles);
    }

    double getCashValue() {
        return myCashValue;
    }

    double getMilesValue() {
        return cashToMiles(this.myCashValue);
    }

    int cashToMiles(double cash) {
        return (int) (cash/MILES_TO_CASH_RATE);
    }

    double milesToCash(int miles) {
        return ((double) miles) * MILES_TO_CASH_RATE;
    }//yay

}
