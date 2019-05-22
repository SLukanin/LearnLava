package Lesson7;

public class Phone {
    private  double diagonal;
    private int battery;
    private String color;
    private String model;

    public void setBattery(int newBattery){
        this.battery = newBattery;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String name){
        this.model = name;
    }

    public void setDiagonal(double diagonal){
        this.diagonal = diagonal;
    }

    public void printInfo(){
        System.out.printf(" Телефон: диагональ - %.2f, батарея - %d ,Б цвет - %s , имя - %s", diagonal, battery, color, model);
    }

}
