package HomeWork7;

public class Trigon {
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;

    public Trigon(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Вичисляем площадь треугольника по формуле Герона

    public double sqr() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public void printInfo() {
        System.out.printf("Информация о треугольнике: \nЦвет треугольника - %s\nДлины сторон - %.3f, %.3f, %.3f\nПериметр - %.3f\nПлощадь - %.3f\n\n"
                , color, sideA, sideB, sideC, perimeter(), sqr());
    }

}
