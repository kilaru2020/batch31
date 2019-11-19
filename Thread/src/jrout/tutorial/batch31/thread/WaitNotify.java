package jrout.tutorial.batch31.thread;

import javax.swing.plaf.TableHeaderUI;

public class WaitNotify {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
    // waiting mechanism...
        synchronized (threadB){
            try {
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +  "  "+threadB.total);
    }
}

class ThreadB extends Thread {
    int total;
    @Override
    public void run() {
        synchronized (this){
            for(int i=0 ; i < 5; i++){
                total += i; // total =  total + i;
                System.out.print("calcuatin...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + "  " + total);
            notify();
        }

    }
}