package Threads.Threads_wait_notify;

class Writer extends Thread {
    Texts txt;

    Writer(Texts t) {
        txt = t;
    }

    public void run() {
        String t;
        do {
            t = txt.get();
            System.out.println(" -> " + t);
        } while (t != " . ");
    }
}