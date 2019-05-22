package Lesson17;

public class Singer1 extends Thread {

    private boolean isRun = true;

    @Override
    public void run() {

        int count = 0;
        while (isRun) {
            for (int i = 0; i < 3; i++) {
                System.out.println("------------la");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.microfon) {
                Monitors.microfon.notify();
            }

            synchronized (Monitors.microfon){

                try {
                    Monitors.microfon.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            count++;
            if (count > 3){
                isRun = false;
            }
        }
    }
}
