package HomeWork10;

public class Main {
    public static void main(String[] args) {
        FractionalNumber drob1 = new FractionalNumber(3,5);
        FractionalNumber drob2 = new FractionalNumber(6,7);
        FractionCalceulator calceulator = new FractionCalceulator();


        System.out.println("Сложение дробей: " + calceulator.add(drob1, drob2));
        System.out.println("Вычитание дробей: " + calceulator.sub(drob1, drob2));
        System.out.println("Умножение дробей: " + calceulator.mul(drob1, drob2));
        System.out.println("Деление дробей: " + calceulator.div(drob1, drob2));


    }
}
