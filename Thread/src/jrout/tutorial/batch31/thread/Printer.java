package jrout.tutorial.batch31.thread;

public class Printer implements Runnable {
    @Override
    public void run() {
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("Thread name %s , printing.. %d",
                        Thread.currentThread().getName(), i));
//            System.out.println("Thread name "+ Thread.currentThread().getName() +", print .. "+ i);
            }
        }

    }
}
