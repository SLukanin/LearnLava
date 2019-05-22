package HomeWork10;

public class FractionCalceulator implements FractionNumberOperation {


    // сложение простых дробей

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionalNumber result = new FractionalNumber();

        //вычисление общего знаменателя

        result.setDivisor(a.getDivisor() * b.getDivisor());
        result.setDividend((a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor()) );

        return result;
    }
    // вычитание простых дробей

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        //вычисление общего знаменателя
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultDividend = (a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor());
        FractionalNumber result = new FractionalNumber();
        result.setDivisor(commonDivisor);
        result.setDividend(a.getDividend() + b.getDividend());
        return result;
    }

    // умножение простых дробей

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
            FractionalNumber result = new FractionalNumber();
            result.setDividend(a.getDividend() * b.getDividend());
            result.setDivisor(a.getDivisor()* b.getDivisor());
            return result;
        }


    // деление простых дробей

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        FractionalNumber result = new FractionalNumber();
        result.setDividend(a.getDividend() * b.getDivisor());
        result.setDivisor(a.getDivisor() * b.getDividend());
        return result;
    }
}
