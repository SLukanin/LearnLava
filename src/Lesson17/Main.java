package Lesson17;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый поток начал работу");

        PrintNumber printNumber = new PrintNumber();
        printNumber.start();

        for (int i = 0; i < 10; i++){

            System.out.println(i + " ");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Первый поток закончил работу");
    }
}
