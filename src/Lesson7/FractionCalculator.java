package Lesson7;

public class FractionCalculator {

    public FractionalNumber summa (FractionalNumber num1, FractionalNumber num2){
        int commonDenum = num1.getDenumerator() * num2.getDenumerator();
        int resultNumerator = (num1.getNumerator() * num2.getDenumerator()) + (num2.getNumerator() * num1.getDenumerator());
        FractionalNumber result = new FractionalNumber();
        result.setNumerator(resultNumerator);
        result.setDenumerator(commonDenum);
        return result;
    }

}
