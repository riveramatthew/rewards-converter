import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RewardValueTests {

    @Test
      void create_with_cash_value() {
      double cashValue = 100;
      RewardValue rewardValue = new RewardValue(cashValue);
      assert cashValue == rewardValue.getCashValue();
    System.out.println(cashValue == rewardValue.getCashValue());
  }

  @Test
  void create_with_miles_value() {
      int milesValue = 10000;
      RewardValue rewardValue = new RewardValue(milesValue);
      assert milesValue ==rewardValue.getMilesValue();
    System.out.println(milesValue == rewardValue.getMilesValue());
  }

  @Test
  void convert_from_cash_to_miles() {
    double cashValue = 100;
    int milesValue = 28571;
    RewardValue rewardValue = new RewardValue(cashValue);
    assert milesValue ==rewardValue.getMilesValue();
    System.out.println(milesValue == rewardValue.getMilesValue());
  }

  @Test
  void convert_from_miles_to_cash() {
    double cashValue = 35;
    int milesValue = 10000;
    RewardValue rewardValue = new RewardValue(milesValue);
    assert cashValue == rewardValue.getCashValue();
    System.out.println(cashValue == rewardValue.getCashValue());
  }
}
