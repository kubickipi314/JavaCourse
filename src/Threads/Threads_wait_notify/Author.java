package Threads.Threads_wait_notify;

class Author extends Thread {
    Texts txt;

    Author(Texts t) {
        txt = t;
    }

    public void run() {
        String[] ss = {" I ", " want ", " to ", " write ", " . "};
        for (String s : ss) {
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            txt.set(s);
        }
    }
}