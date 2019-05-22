package HomeWork7;

public class Foursquare {
    private double side;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double perimeter() {
        return side * 4;
    }

    public double sqr(){
        return side * side;
    }

    public void printInfo(){
        System.out.printf("Информация о квадрате:\nЦвет - %s\nДлина стороны - %.3f\nПериметр - %.3f\nПлощадь - %.3f\n\n"
                , color, side, perimeter(), sqr());
    }
}
