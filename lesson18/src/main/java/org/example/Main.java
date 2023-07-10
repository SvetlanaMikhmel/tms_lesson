package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new CustomThread("T3");
        Thread t2 = new CustomThread("T2");
        Thread t1 = new CustomThread("T1");
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
    }
}