package Lesson13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = getNumber(scanner);
    }

    private static int getNumber(Scanner scanner) {
        int number = 0;
        try {
             number = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Введите еще раз: ");
            return getNumber(scanner);
        }
        return number;
    }
}
