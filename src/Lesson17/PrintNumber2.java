package Lesson17;

public class PrintNumber2 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Третий поток начал работу");

            for (int i = -10000; i > -10050; i--){

                System.out.println(i + " ");

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();

            System.out.println("Третий поток закончил работу");
        }
    }
}
