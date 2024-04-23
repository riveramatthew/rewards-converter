/**
 * RewardValue class created by Stephanie Bernades (StephyB-97) on April 22, 2024.
 * Represents a reward value with methods to convert between cash and miles.
 */

public class RewardValue {
    private double cash;
    private int miles;
    private static final double fixed_rate = 0.0035;

    //Constructor that accepts cash value
    RewardValue(double cash){
        this.cash = cash;
        this.miles = (int)(cash / fixed_rate);
    }

    //constructor that accepts miles values
    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * fixed_rate;
    }

    //Method to get cash value
   public double getCashValue(){
        return this.cash;
    }

    //method to get miles value
    public int getMilesValue(){
        return this.miles;
    }



}
