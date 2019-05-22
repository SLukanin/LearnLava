package HomeWork10;

public class FractionalNumber implements FractionNumber {

    private int dividend;
    private int divisor;


    public FractionalNumber() {
        this.divisor = DEFAULT_DIVISOR_VALUE;
    }

    @Override
    public double value() {
        return dividend / divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;

    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }

    public FractionalNumber(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }
}

