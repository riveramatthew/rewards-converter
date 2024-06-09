public class RewardValue {
        private double cashValue;
        private double milesValue;

        // Constructor that accepts a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue / 0.0035; // Convert cash to miles
        }

        // Constructor that accepts a value in miles
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; // Convert miles to cash
        }

        // Method to get the cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get the miles value
        public double getMilesValue() {
            return milesValue;
        }
    }
