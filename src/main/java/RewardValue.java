public class RewardValue {

    int m;
    double c;

    // This constructor will accept cash values
    public RewardValue(double cash){
        super();
        this.c = cash;
    }

    // This constructor will accept miles values
    public RewardValue(int miles){
        super();
        this.m = miles;
    }

    public double getCashValue(){
        return m * 0.0035;
    }

    public double getMilesValue(){
        return c / 0.0035;
    }

}
