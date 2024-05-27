/* author: Nandika Taneja  tanejanandika@gmail.com*/
public class RewardValue
{
    private double cashValue;
    private int milesValue;
    private static final double conversion=0.0035; /*conversion Rate*/

    /* constructor to receive cash value as input*/
    RewardValue(double cash)
    {
        this.cashValue =cash;
        milesValue=cash_to_miles(cashValue);
    }

    /* constructor to receive miles value as input */
    RewardValue(int miles)
    {
        this.milesValue =miles;
        cashValue=miles_to_cash(milesValue);

    }


    /* method to return miles value*/
    public int getMilesValue( )
    {
            return milesValue;
    }

    /* method to return cash value*/
    public double getCashValue( )
    {
        return cashValue;
    }

    /* method to convert cash value to miles value */
    private int cash_to_miles(double cash){
        return (int) (cash/conversion);
    }

    /* method to convert miles value to cash value */
    private double miles_to_cash(int miles){
        return miles*conversion;
    }



}

