public class RewardValue {
  private int miles;
  private double cashValue;
  private double conversion_rate = 0.0035;

  public RewardValue(double cash) {
    this.cashValue = cash;
    this.miles = (int)(this.getCashValue() * (1/conversion_rate));
  }
  public RewardValue(int miles) {
    this.miles = miles;
    this.cashValue = this.getMilesValue() * conversion_rate;

  }

  public double getCashValue() {return this.cashValue;}
  public int getMilesValue() {return this.miles;}

  public boolean setMilesValue(int miles) {
    if (miles < 0) {
      return false;
    }
    this.miles = miles;
    return true;
  }

  public boolean setCashValue(double cash) {
    if (cash < 0) {
      return false;
    }
    this.cashValue = cash;
    return true;
  }
}
