
public class RewardValue {
	private double cashValue;
	private int mileValue;
	
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}
	
	public RewardValue(int mileValue) {
		this.mileValue = mileValue;
		
	}
	
	public double getCashValue() {
		return cashValue;
	}
	
	public int getMilesValue() {
		return mileValue;
	}
	
	public double convertMileToCash(int miles) {
		double cash = miles*0.0035;
		return cash;
	}
	
	public double convertCashToMiles(double cash) {
		double miles = cash/0.0035;
		return miles;
	}

}
