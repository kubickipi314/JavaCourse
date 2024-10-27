package Threads.Threads_wait_notify;

public class Main {

    public static void main(String[] args) {
        Texts t = new Texts();
        Thread t1 = new Author(t);
        Thread t2 = new Writer(t);
        t1.start();
        t2.start();
    }

}