
package main.java;

   public class RewardValue {

       private double cashValue;
       private double milesValue;
       private static final double MILES_TO_CASH_RATE = 0.0035;

       public RewardValue(double cashValue) {
           this.cashValue = cashValue;
           this.milesValue = cashValue / MILES_TO_CASH_RATE; // Convert cash to miles
       }

       public RewardValue(int milesValue) {
           this.milesValue = milesValue;
           this.cashValue = milesValue * MILES_TO_CASH_RATE; // Convert miles to cash
       }

       public double getCashValue() {
           return cashValue;
       }

       public double getMilesValue() {
           return milesValue;
       }
   }
