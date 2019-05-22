package HomeWork7;

public class FractionNumber {
    private int numerator;
    private int denumerator = 1;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenumerator(int denumerator) {
        if (denumerator == 0) {
            System.out.println("На ноль делить нельзя!!!");
        } else
            this.denumerator = denumerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void printResult() {
        int celoe = numerator / denumerator;
        int ostatok = numerator % denumerator;
        System.out.printf("%d %d/%d", celoe, ostatok, denumerator);
    }

}
