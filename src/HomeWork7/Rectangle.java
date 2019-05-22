package HomeWork7;

public class Rectangle {
    private double sideA;
    private double sideB;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }

    public double perimeter() {
        return (sideA * 2) + (sideB * 2);
    }

    public double sqr(){
        return sideA * sideB;
    }

    public void printInfo(){
        System.out.printf("Информация о квадрате:\nЦвет - %s\nДлина стороны А - %.3f\nДлина стороны В - %.3f\nПериметр - %.3f\nПлощадь - %.3f\n\n"
                , color, sideA, sideB, perimeter(), sqr());
    }
}
