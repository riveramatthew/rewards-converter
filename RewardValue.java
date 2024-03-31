public class RewardValue {

	private double cashValue;
	public RewardValue(double cashValue) {
		// TODO Auto-generated constructor stub
		this.cashValue=cashValue;
		
	}

	public Double getCashValue() {
		// TODO Auto-generated method stub
		
		return cashValue;
	}

	public Integer getMilesValue() {
		// TODO Auto-generated method stub
		
		return (int)cashValue;
	}

}
