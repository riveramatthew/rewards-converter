public class RewardValue {
    // use private variables for extra security
    private double cash=0;
    private double miles=0;


public RewardValue(double cash){
    this.cash = cash;
    this.miles = cash/0.0035;
}

// convert to int (can't method overload same constructor type)
public RewardValue(int miles){
    this.miles = cash;
    this.cash = cash*0.0035;
    }

public double getCashValue(){
    return cash;
}

public double getMilesValue(){
    return miles;
}

// not needed
public static void main(String[] args) {
    
}
}