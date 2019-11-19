package jrout.tutorial.batch31.thread;

public class SharingResources {
    public static void main(String[] args) {
        Runnable printer = new Printer();

        Thread t1 = new Thread(printer,"A");
        Thread t2 = new Thread(printer , "B");
        Thread t3 = new Thread(printer, "C");

        t1.start();
        t2.start();
        t3.start();
    }
}
