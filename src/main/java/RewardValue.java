
public class RewardValue {

	private double cash;
	private float miles;

	public RewardValue(double cash) {
		this.setCash(cash);
		this.setMiles((float) (cash * 0.0035));
	}

	public RewardValue(float miles) {
		this.setMiles(miles);
		this.setCash(miles / 0.0035);	
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public float getMilesValue() {
		return miles;
	}

	public void setMiles(float miles) {
		this.miles = miles;
	}

}
