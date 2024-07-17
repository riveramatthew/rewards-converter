public class RewardValue {
    //variables
    double cash = 0;
    double miles = 0;

    //constructors
    RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash/0.0035;
    }

    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles*0.0035;
    }

    //get functions
    double getCashValue() {
        return cash;
    }

    double getMilesValue() {
        return miles;
    }
}
