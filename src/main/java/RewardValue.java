import java.sql.SQLOutput;

public class RewardValue {
    double cashValue;
    int valueMiles;
    public RewardValue(int valueMiles) {
        this.valueMiles=valueMiles;
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return valueMiles;
    }
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public String getMilesValueFromCash(){
        var rewardsValue = new RewardValue(cashValue);
        double cashToMiles = rewardsValue.getCashValue()/ 0.0035;
        String valueMiles = String.valueOf(cashToMiles);
        //System.out.println("Your " + rewardsValue + " Dollars (USD) are: " + cashToMiles + " miles");
        return valueMiles;
    }

    public String getCashValueFromMiles(){
        var rewardsValue = new RewardValue(valueMiles);
        int milesToCash = (int)(rewardsValue.getMilesValue() * 0.0035);
        String valueCash = String.valueOf(milesToCash);
        return valueCash;
    }
}
