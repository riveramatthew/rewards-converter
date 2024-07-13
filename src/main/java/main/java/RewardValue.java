package main.java;

public class RewardValue {
	
	private double cashValue;
	private double milesValue;
	private double MilesToCash = 0.0035;

	public RewardValue(double cashValue) {
		super();
		this.cashValue = cashValue;
		this.milesValue = cashValue / MilesToCash;
	}
	
	public RewardValue( int milesValue) {
		super();
		this.milesValue = milesValue ;
		this.cashValue = cashValue * MilesToCash;
	}

	public double getCashValue() {
		return cashValue;
	}

	public void setCashValue(int cashValue) {
		this.cashValue = cashValue;
	}

	public double getMilesValue() {
		return milesValue;
	}

	public void setMilesValue(int milesValue) {
		this.milesValue = milesValue;
	}
	
	


}
