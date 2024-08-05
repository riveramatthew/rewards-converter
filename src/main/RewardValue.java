public class RewardValue {
    private double cashValue;
    private double milesValue; 
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue (double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    piblic RewardValue (double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this,cashValue = milesValue * MILES_TO_Cash_Rate;

        }
        public double getCashValue() {
            return cashValue;
        }
        public double getMilesValue() {
            return milesValue;
        }

        public static void main(String[] args) {
            RewardValue reward1 = new RewardValue(100);
            System.out.println("Cash Value: $" +reward1.getCashValue());
            System.out.println("Miles Value: " + reward1.getMilesValue() + "miles");

            RewardValue reward2 = new RewardValue (2000, true);
            System.out.println("Cash Value: $" + reward2.getCashValue());
            System.out.println("Miles Value: " + reward1.getMilesValue() + "miles");
        }
    }
    
}
