package org.example;

public class CustomThread extends Thread {
    private String threadName;

    public CustomThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " - начал свою работу");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " - закончил свою работу");
    }
}
