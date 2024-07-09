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

// public class RewardValue {
//     private double cashValue;
//     private double milesValue;

//     // Conversion rate from miles to cash
//     private static final double MILES_TO_CASH_RATE = 0.0035;

//     // Constructor that accepts a cash value
//     public RewardValue(double cashValue) {
//         this.cashValue = cashValue;
//         this.milesValue = cashValue / MILES_TO_CASH_RATE;
//     }

//     // Constructor that accepts a value in miles
//     public RewardValue(double milesValue, boolean isMiles) {
//         if (isMiles) {
//             this.milesValue = milesValue;
//             this.cashValue = milesValue * MILES_TO_CASH_RATE;
//         } else {
//             this.cashValue = milesValue;
//             this.milesValue = milesValue / MILES_TO_CASH_RATE;
//         }
//     }

//     // Method to get the cash value of the RewardValue
//     public double getCashValue() {
//         return cashValue;
//     }

//     // Method to get the miles value of the RewardValue
//     public double getMilesValue() {
//         return milesValue;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         RewardValue rewardCash = new RewardValue(100.0);
//         System.out.println("Cash Value: " + rewardCash.getCashValue()); // 100.0
//         System.out.println("Miles Value: " + rewardCash.getMilesValue()); // 100.0 / 0.0035

//         RewardValue rewardMiles = new RewardValue(10000.0, true);
//         System.out.println("Cash Value: " + rewardMiles.getCashValue()); // 10000.0 * 0.0035
//         System.out.println("Miles Value: " + rewardMiles.getMilesValue()); // 10000.0
//     }
// }
