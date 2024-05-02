import java.util.Scanner;

public class RewardValue{

	double cash;
	int miles;
	double conversion;
	
	public RewardValue(double cash){
		this.cash = cash;
		this.conversion = 0.0035;
	}

	public RewardValue(int miles){
		this.miles = miles;
		this.conversion = 0.0035;
	}

	public double getCashValue(){
		double cash = miles * conversion;
		return cash;

	}

	public double getMilesValue(){
		return cash / conversion;
	}

}