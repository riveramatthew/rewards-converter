public class RewardValue {
    private double cashValue;
    private double airlineMiles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.airlineMiles = convertCashToMiles(cashValue);
    }

    public RewardValue(double airlineMiles, boolean isMiles) {
        if (isMiles) {
            this.airlineMiles = airlineMiles;
            this.cashValue = convertMilesToCash(airlineMiles);
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getAirlineMiles() {
        return airlineMiles;
    }

    public void setAirlineMiles(double airlineMiles) {
        this.airlineMiles = airlineMiles;
    }

    // Conversion from cash to miles
    public double convertCashToMiles(double cashAmount) {
        return cashAmount * 1000; 
    }

    // Conversion from miles to cash at rate of 0.0035
    public double convertMilesToCash(double miles) {
        return miles * 0.0035;
    }
}
