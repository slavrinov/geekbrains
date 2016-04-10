package lesson6;

/**
 * Created by Сергей on 28.02.2016.
 */
public class MyThread {


    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <100000 ; j++) {
                    System.out.println("j = " + j);
                }

            }
        });
        t.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 0; k <100000 ; k++) {
                    System.out.println("k = " + k);
                }

            }
        });
        t2.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
