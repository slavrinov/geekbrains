package lesson6;

/**
 * Created by Сергей on 28.02.2016.
 */
public class NoVisibility {

    public static boolean ready;
    private static int number;

    public static class     ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ReaderThread  t  = new ReaderThread();
        t.start();
        number = 42;
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ready =true;

    }
}
