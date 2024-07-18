public class RewardValue {

    double myCashValue;
    int myMiles;
    public RewardValue(double cashValue) {
        this.myCashValue = cashValue;
    }

    public RewardValue(int myMiles) {
        this.myMiles = myMiles;
    }

    double getCashValue() {
        return myCashValue;
    }

    double getMilesValue() {
        return myMiles;
    }

    double cashToMiles() {
        return myCashValue/.0035;
    }

    double milesToCash() {
        return ((double) myMiles) * .0035;
    }

}
