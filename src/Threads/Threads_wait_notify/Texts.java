package Threads.Threads_wait_notify;

class Texts {
    String txt = null;
    boolean newTxt = false;

    synchronized void set(String s) {
        while (newTxt) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        txt = s;
        newTxt = true;
        notifyAll();
    }

    synchronized String get() {
        while (!newTxt) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        newTxt = false;
        notifyAll();
        return txt;
    }
}