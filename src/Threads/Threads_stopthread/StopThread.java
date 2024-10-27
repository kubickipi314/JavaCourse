package Threads_stopthread;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(
                () -> {
                    int i = 0;
                    while (!stopRequested) i++;
                });
        //backgroundThread.setDaemon(true);
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}