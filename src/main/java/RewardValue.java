
public class RewardValue {
	private double cashValue;

	private int milesValue;

	public RewardValue(int milesValue) {
		this.milesValue = milesValue;
	}

	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}

	public double getCashValue() {
		return cashValue;
	}

	public int getMilesValue() {
		return milesValue;
	}

}
