package jrout.tutorial.batch31.thread;

//public class Horse extends Thread {
public class Horse extends Animal implements Runnable {
    private String rider;
    private String horseName;
    public Horse(String horseName, String rider){
        this.rider = rider;
        this.horseName = horseName;
//        this.setName(this.horseName);
    }

    @Override
    public void run() {
        // Run five miles...
        for(int i = 1 ; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.horseName + " running "+ i +" miles for " +
                    ""+ this.rider +" Thread["+Thread.currentThread().getName()+"]");

        }
    }
}
