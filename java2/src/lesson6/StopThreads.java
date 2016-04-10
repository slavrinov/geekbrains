package lesson6;

import java.util.concurrent.TimeUnit;

public class StopThreads {

    Object monitor;

    static class Task extends Thread {
        @Override
        public void run() {

            while (!isInterrupted()) {
                System.out.println("in thread");

                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    interrupt(); // set flag!

                    // close thread's resources
                    System.out.println("Catch an exception!");
                }
            }
        }
    }

    static class Task2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("->" + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // stop Task
        Thread t = new Task();
        t.start();

        // Другой способ поспать
        //TimeUnit.SECONDS.sleep(1);



        // запускаем другой поток
        Thread t2 = new Task2();
        t2.start();

        TimeUnit.SECONDS.sleep(4);
        t.interrupt();



        t2.interrupt();
    }


}
