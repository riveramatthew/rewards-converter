public class RewardValue {

    public static double miles;
    public static double cashValue;

  
    RewardValue(double newCashValue){
        cashValue = newCashValue;

        // convert cash value to miles
      miles = cashToMiles(cashValue);
    }

    RewardValue(int newMiles) {
        miles = newMiles;

         // Convert miles value to cash
        cashValue = milesToCash(miles);
    }

    public static double cashToMiles(double cashValue){
        return cashValue / 0.0035;
    }

    public static double milesToCash(double miles){
        return miles * 0.0035;
    }

    public double getCashValue(){
        System.out.println("The cash value is: $" + cashValue);
        return cashValue;
    }

    public double getMilesValue(){ 
        System.out.println("Number of Miles: " + miles);
        return miles;
    }

    
    
}
