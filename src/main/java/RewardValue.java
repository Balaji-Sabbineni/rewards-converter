import java.text.DecimalFormat;

public class RewardValue {
    private double cashValue, milesValue;
    private final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue  = cashValue * MILES_TO_CASH;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue / MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return Double.parseDouble(new DecimalFormat("#.000").format(milesValue));
    }

}