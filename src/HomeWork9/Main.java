package HomeWork9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Romb romb1 = new Romb();
        romb1.setVisota(5);
        romb1.setOsnovanie(10);
        romb1.setName("ромб_1");
        Romb romb2 = new Romb();
        romb2.setVisota(3);
        romb2.setOsnovanie(7);
        romb2.setName("ромб_2");
        Romb romb3 = new Romb();
        romb3.setVisota(4);
        romb3.setOsnovanie(8);
        romb3.setName("ромб_2");


        Triangle treug1 = new Triangle();
        treug1.setSide1(3);
        treug1.setSide2(3);
        treug1.setSide3(3);
        treug1.setName("треугольник_1");
        Triangle treug2 = new Triangle();
        treug2.setSide1(3);
        treug2.setSide3(4);
        treug2.setSide3(5);
        treug2.setName("треугольник_2");
        Triangle treug3 = new Triangle();
        treug3.setSide1(5);
        treug3.setSide3(10);
        treug3.setSide3(10);
        treug3.setName("треугольник_3");

        Shape[] shapes = new Shape[6];
        shapes[0] = romb1;
        shapes[1] = romb2;
        shapes[2] = romb3;
        shapes[3] = treug1;
        shapes[4] = treug2;
        shapes[5] = treug3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Распечатать площадь или периметр фигур?");
        String s = scanner.nextLine();

        for (Shape i: shapes) {
            if (s.toLowerCase().equals("площадь")){
                i.printPloshad();
            } else if (s.toLowerCase().equals("периметр")){
                i.prinPerimeter();
            } else {
                System.out.println("Вы ввели неверное значение. Нужно ввести площадь или периметр");
                break;
            }

        }

    }
}
