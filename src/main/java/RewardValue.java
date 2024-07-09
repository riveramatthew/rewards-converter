public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
// public class RewardValue{
//     private double cashValue;
//     private double milesValue;
//     private static final double MILES_TO_CASH_VALUE = 0.0035;

//     public RewardValue(double cashValue){
//         this.cashValue = cashValue;
//         this.milesValue = cashValue / MILES_TO_CASH_VALUE;
//     }
//     public RewardValue(double milesValue, boolean isMiles){
//         if (isMiles){
//             this.milesValue = milesValue;
//             this.cashValue = milesValue * MILES_TO_CASH_VALUE;
//         } else {
//             this.cashValue = milesValue;
//             this.milesValue = (int) (milesValue / MILES_TO_CASH_VALUE);
//         }
//     }
//     public double getCashValue(){
//         return cashValue;
//     }

//     public double getMilesValue(){
//         return milesValue;
//     }

//     public static void main(String [] args){
//         RewardValue rewardCash = new RewardValue(100.0);
//         System.out.println(rewardCash.getCashValue());
//         System.out.println(rewardCash.getMilesValue());

//         RewardValue rewardMiles = new RewardValue(100.0);
//         System.out.println(rewardMiles.getCashValue());
//         System.out.println(rewardMiles.getMilesValue());
//     }

// }
