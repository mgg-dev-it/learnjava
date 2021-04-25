package mggdevit.learnjava.multi;

/**
 *
 * @author mgg-dev-it
 */
public abstract class LearnThread {

    public static void learn() {
        Runnable r = () -> {
            System.out.println("I am a runnable in thread " + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        Thread t3 = new Thread(r, "t3");

        System.out.println("Available processors " + Runtime.getRuntime().availableProcessors());
        System.out.println("Currently in thread " + Thread.currentThread().getName());
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace(System.out);
        }

        Shared s = new Shared();
        Runnable rs = () -> {
            for (int i = 0; i < 1000; i++) {
                ++s.i;
            }
        };
        Thread ts1 = new Thread(rs, "ts1");
        Thread ts2 = new Thread(rs, "ts2");
        ts1.start();
        ts2.start();
        try {
            ts1.join();
            ts2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("s.i = " + s.i);

        Shared s2 = new Shared();
        Runnable rs2 = () -> {
            for (int i = 0; i < 1000; i++) {
                s2.increment();
            }
        };
        Thread ts21 = new Thread(rs2, "ts21");
        Thread ts22 = new Thread(rs2, "ts22");
        ts21.start();
        ts22.start();
        try {
            ts21.join();
            ts22.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("s2.i = " + s2.i);

    }
}
