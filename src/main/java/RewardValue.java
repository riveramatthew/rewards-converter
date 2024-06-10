
public class RewardValue {

	private double cash;
	private int miles;
	private final static double MILES_TO_CASH = 0.0035;

	public RewardValue(double cash) {
		this.cash = cash;
		this.miles = (int) (cash / MILES_TO_CASH);
	}

	public RewardValue(int miles) {
		this.setMiles(miles);
		this.cash = (miles / 0.0035);
	}

	public double getCashValue() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public float getMilesValue() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}
