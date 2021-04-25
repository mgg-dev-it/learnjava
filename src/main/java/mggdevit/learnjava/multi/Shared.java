package mggdevit.learnjava.multi;

/**
 *
 * @author mgg-dev-it
 */
public class Shared {

    public int i;

    public synchronized void increment() {
        ++i;
    }
}
