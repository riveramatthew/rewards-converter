import java.util.Scanner;

public class RewardValue{

	private double cash;
	private int miles;
	public static double conversion = 0.0035;
	
	public RewardValue(double cash){
		this.cash = cash;
	}

	public RewardValue(int miles){
		this.miles = miles;
		this.cash = convertToCash(miles);
	}

	private double convertToCash(int miles){
		return miles * conversion;
	}

	private int convertToMiles(double cash){
		return (int) (cash / conversion);
	}

	public double getCashValue(){
		return this.cash;

	}

	public int getMilesValue(){
		return convertToMiles(this.cash);
	}

}