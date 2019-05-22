package Lesson6;

import HomeWork5.SomeUtils;
import Lesson5.StringUtils;
import Lesson5.Student;


public class Main1 {
    public static void main(String[] args) {
        String text = "qwerty";
        Student.PrintHello(text);
        int kvadrat = Student.squareArea(15);

        System.out.println(Student.squareArea(kvadrat));

        System.out.println(StringUtils.reverse12(text));

        Student.perimeteTringle(3,4,7);

        StringUtils.printGlasnye(text);
        StringUtils.printGlasnye("abcdefgeipouhn");

        SomeUtils.printMinNum(8,3,4);


    }
}
