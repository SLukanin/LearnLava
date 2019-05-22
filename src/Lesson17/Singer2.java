package Lesson17;

public class Singer2 extends Thread {

    @Override
    public void run() {
        while (true){

            synchronized (Monitors.microfon){

                try {
                    Monitors.microfon.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < 4; i++) {
                    System.out.println("------------ululu");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (Monitors.microfon) {
                    Monitors.microfon.notify();
                }

            }
        }
    }
}
