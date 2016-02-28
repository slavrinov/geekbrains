package lesson6;


import java.util.logging.Logger;

/**
 *
 */
public class DeadLock {
    static Logger logger = Logger.getLogger("DeadLock.class");

    static class Account {
        int sum;
        int id;

        public Account(int id) {
            this.id = id;
        }

        static void transact(final Account from, final Account to, int amount) {
            Account lock1, lock2;
            if (from.id < to.id) {
                lock1 = from;
                lock2 = to;
            } else {
                lock1 = to;
                lock2 = from;
            }

            synchronized (lock1) {
                logger.info("Lock1({}) was acquired by thread {}. Waiting for lock2({})"+ lock1.id+ Thread.currentThread().getName()+ lock2.id);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    logger.info("Lock2({}) was acquired by thread {}. Waiting for lock1({})" +lock2.id + Thread.currentThread().getName() + lock1.id);
                    from.sum -= amount;
                    to.sum += amount;
                }
            }
        }
    }

    public static void main(String[] args) {

        final Account a1 = new Account(1);
        a1.sum = 100;
        final Account a2 = new Account(2);
        a2.sum = 300;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Account.transact(a1, a2, 10);
            }
        }, "<Transact a1 to a2>");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Account.transact(a2, a1, 20);
            }
        }, "<Transact a2 to a1>");

        t1.start();
        t2.start();
    }

}
