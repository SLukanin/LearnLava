package Lesson5;

public class Student {
    public static void PrintHello(String str) {
        System.out.println(str);
    }

    // Возращает площадь квадрата

    public static int squareArea(int side){
        side = side*side;
        return side;
    }

    public static void perimeteTringle(int a, int b, int c){
        System.out.println("Периметр треугольника = " + a + b +c);
    }


}
