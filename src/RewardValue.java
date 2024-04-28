
public class RewardValue {
	private double miles = 0;

	private double cash = 0;
	
	public RewardValue(double cash){
		this.cash = cash;
		this.miles = 0;
		
	}

	
	public RewardValue(int miles){
		this.miles = miles;
		this.cash = 0;
		
	}
	
	double getCashValue() {
		if (this.cash > 0 ) {
			return this.cash;
			
		}
		return this.miles * 0.0035;
				
	}
	
	double getMilesValue() {
		if (this.miles > 0) {
			return this.miles;
		}
		
		return this.cash / .0035;
	}
	
	
}


