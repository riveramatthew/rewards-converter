public class RewardClass {

    private RewardValue rewardValue;

    public RewardClass(Double cashValue) {
        this.rewardValue = new RewardValue(cashValue);
    }

    public RewardClass(Integer milesValue) {
        this.rewardValue = new RewardValue(milesValue);
    }

    public double getCashValue() {
        return rewardValue.getCashValue();
    }

    public int getMilesValue() {
        return rewardValue.getMilesValue();
    }

    private static class RewardValue {

        private static final double CONVERSION_RATE = 0.0035;

        private Double cashValue;
        private Integer milesValue;

        private RewardValue(Double cashValue) {
            if (cashValue == null) {
                throw new IllegalArgumentException("Cash value cannot be null");
            }
            this.cashValue = cashValue;
            this.milesValue = null;
        }

        private RewardValue(Integer milesValue) {
            if (milesValue == null) {
                throw new IllegalArgumentException("Miles value cannot be null");
            }
            this.cashValue = null;
            this.milesValue = milesValue;
        }

        public double getCashValue() {
            if (cashValue!= null) {
                return cashValue;
            } else {
                return milesValue * CONVERSION_RATE;
            }
        }

        public int getMilesValue() {
            if (milesValue!= null) {
                return milesValue;
            } else {
                return (int) Math.round(cashValue / CONVERSION_RATE);
            }
        }
    }
}