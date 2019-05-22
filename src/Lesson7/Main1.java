package Lesson7;

public class Main1 {
    public static void main(String[] args) {
        FractionalNumber number1 = new FractionalNumber();
        FractionalNumber number2 = new FractionalNumber();

        number1.setNumerator(2);
        number1.setDenumerator(0);

        number2.setNumerator(7);
        number2.setDenumerator(6);

       FractionCalculator calc = new FractionCalculator();
       FractionalNumber result = calc.summa(number1, number2);

       result.printResult();


    }
}
