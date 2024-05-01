public class RewardValue {

  private double cashVal;
  private double milesVal;

    public RewardValue(double cashVal) {
        this.cashVal = cashVal;
        this.milesVal = convertCashToMiles(cashVal);
    }

    public RewardValue(double milesVal, boolean isMiles) {
        if (isMiles) {
            this.milesVal = milesVal;
            this.cashVal = convertMilesToCash(milesVal);
        } else {
            this.milesVal = convertCashToMiles(milesVal);
            this.cashVal = milesVal;
        }
    }

  public double getCashValue() {
      return cashVal;
  }

  public double getMilesValue() {
      return milesVal;
  }

  private double convertCashToMiles(double cashVal) {
      return cashVal / 0.0035;
  }

  private double convertMilesToCash(double milesVal) {
      return milesVal * 0.0035;
  }
}