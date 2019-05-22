package HomeWork7;

public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else System.out.println("Радиус должен быть больше 0");
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double square() {
        return Math.PI * radius*radius;
    }

    public double perimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;

    }

    public void printInfo(){
        System.out.printf("Информация о круге:\nЦвет - %s\nРадиус - %.3f\nДлина окружности = %.3f\nПлощадь - %.3f\n\n"
                , color, radius, perimeter(), square());
    }
}


