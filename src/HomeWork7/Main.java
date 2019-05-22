package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Circle krug1 = new Circle();
        krug1.setColor("Зеленый");
        krug1.setRadius(3);
        krug1.printInfo();

        Circle krug2 = new Circle();
        krug2.setColor("Красный");
        krug2.setRadius(5.6);
        krug2.printInfo();

        Foursquare kvadrat1 = new Foursquare();
        kvadrat1.setColor("Черный");
        kvadrat1.setSide(10);
        Foursquare kvadrat2 = new Foursquare();
        kvadrat2.setColor("Белый");
        kvadrat2.setSide(4.8);

        kvadrat1.printInfo();
        kvadrat2.printInfo();

        Trigon trigon1 = new Trigon(3, 4.5, 2.7);
        trigon1.setColor("Фиолетовый");

        Trigon trigon2 = new Trigon(2, 2.3, 4);
        trigon2.setColor("Синий");

        trigon1.printInfo();
        trigon2.printInfo();

        Rectangle pr1 = new Rectangle();
        pr1.setColor("Оранжевый");
        pr1.setSideA(4);
        pr1.setSideB(5);
        pr1.printInfo();

        FractionNumber drod1 = new FractionNumber();
        drod1.setNumerator(6);
        drod1.setDenumerator(24);
        FractionReduce.reduce(drod1);

    }
}
