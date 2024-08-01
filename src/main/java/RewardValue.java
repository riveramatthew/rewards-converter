public class RewardValue {

    final double MILES_TO_CASH_RATE = 0.0035;
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
        this.c = convertToCash(miles);
    }

    private double convertToCash(int miles){
        c = miles * MILES_TO_CASH_RATE;
        return c;
    }

    private int convertToMiles(double cash){
        m = (int)(cash / MILES_TO_CASH_RATE);
        return m;
    }

    public double getCashValue(){
        return c;
    }

    public int getMilesValue(){
        return convertToMiles(c);
    }

}
