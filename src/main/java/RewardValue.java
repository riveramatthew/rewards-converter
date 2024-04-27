public class RewardValue {
    double cashValue;

    public RewardValue(int valueMiles) {
    }

    public double getCashValue(){
        return cashValue;
    }
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public String getMilesValue(){
        var rewardsValue = new RewardValue(cashValue);
        double cashToMiles = rewardsValue.getCashValue()/ 0.0035;
        String valueMiles = String.valueOf(cashToMiles);
        //System.out.println("Your " + rewardsValue + " Dollars (USD) are: " + cashToMiles + " miles");
        return valueMiles;
    }
}
