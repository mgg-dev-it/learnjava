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
    }
}
