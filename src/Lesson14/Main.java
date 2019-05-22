package Lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String inputNum = scanner.nextLine();
        int num = 0;
        try {
            num = Integer.parseInt(inputNum);

        } catch (NumberFormatException e){
            e.printStackTrace();
            return;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("неверный ввод");
            return;
        } finally {
            System.out.println("finally!!!!");
        }


        System.out.println(num);
    }
}
