package Lesson17;

public class PrintNumber extends Thread {
    @Override
    public void run() {
        System.out.println("Второй поток начал работу");

        for (int i = 10000; i < 10020; i++){

            System.out.println(i + " ");

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 10010){
                PrintNumber2 printNumber2 = new PrintNumber2();
                Thread thread2 = new Thread(printNumber2 );
                thread2.start();

            }
        }

        System.out.println();

        System.out.println("Второнй поток закончил работу");
    }
}
