/**
 * A class for RewardValue which will convert miles into a cash value and visa versa.
 */
public class RewardValue {
  private int miles;
  private double cashValue;
  private double conversion_rate = 0.0035;

  /**
   * Creates a RewardValue object given a cash value.
   * 
   * @param cash a cash value of type double
   */
  public RewardValue(double cash) {
    this.cashValue = cash;
    this.miles = (int)(this.getCashValue() * (1/conversion_rate));
  }

  /**
   * Creates a RewardValue object given an integer for miles.
   * 
   * @param miles a miles value of type int
   */
  public RewardValue(int miles) {
    this.miles = miles;
    this.cashValue = this.getMilesValue() * conversion_rate;
  }

  /**
   * Getter method for the object's cash value.
   * 
   * @return the cash value of type double
   */
  public double getCashValue() {
    return this.cashValue;
  }

  /**
   * Getter method for the object's miles value.
   * 
   * @return the miles value of type int
   */
  public int getMilesValue() {
    return this.miles;
  }

  /**
   * Setter method for the object's miles value.
   * 
   * @param miles an updated value for miles
   * @return a boolean indicating a successful update of the miles value.
   */
  public boolean setMilesValue(int miles) {
    if (miles < 0) {
      return false;
    }
    this.miles = miles;
    return true;
  }

  /**
   * Setter method for the object's cash value.
   * 
   * @param cash an updated value for cash
   * @return a boolean indicating a successful update of the cash value.
   */
  public boolean setCashValue(double cash) {
    if (cash < 0) {
      return false;
    }
    this.cashValue = cash;
    return true;
  }
}
