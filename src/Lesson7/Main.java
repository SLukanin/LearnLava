package Lesson7;

public class Main {
  public static void main(String[] args) {
    Phone nokia  = new Phone();
    Phone xiaomi = new Phone();

    nokia.setBattery(2900);
    nokia.setColor("Red");
    nokia.setModel("3310");
    nokia.setDiagonal(2.4);

    xiaomi.setColor("Black");
    xiaomi.setBattery(3300);
    xiaomi.setModel("Mi Note 3");
    xiaomi.setDiagonal(5.5);

    nokia.printInfo();
    System.out.println();
    xiaomi.printInfo();
  }


}
