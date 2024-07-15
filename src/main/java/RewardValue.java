public class RewardValue{
    double cash;
    int miles;

    RewardValue(double cash){

        if(cash>0){
            this.cash= cash;
           

            
        }
        else{
            throw new IllegalArgumentException("Cash must be a non-negative.");
        }
       

    }
    RewardValue(int miles){
        if(miles>0){
            this.miles = miles;
           
        }
        else{
            throw new IllegalArgumentException("Miles must be a non-negative.");
        }
       
    }

    void convert_from_cash_to_miles(double cash){
        miles = (int)(cash/0.0035);
    }

    void convert_from_miles_to_cash(int miles){
        cash = miles *0.0035;
    }

    

    double getCashValue(){
        
        return cash;
    }

    int getMilesValue(){
       
        return miles;
    }

   
}