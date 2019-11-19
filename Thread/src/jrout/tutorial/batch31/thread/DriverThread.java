package jrout.tutorial.batch31.thread;

public class DriverThread {
    public static void main(String[] args) {
        System.out.println("Start Thread Name ="+ Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();
//        Horse horse1 = new Horse("Cheeta", "Peter");
//        horse1.start();
        Thread t1 = new Thread(new Horse("Cheeta", "Peter"));
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(System.lineSeparator());
        Horse horse2 = new Horse("Betal","Tom");
//        horse2.start();
        Thread t2 = new Thread(horse2, "Betal");
        t2.start();


        System.out.println("End Thread Name ="+ Thread.currentThread().getName());

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time = "+ (endTime-startTime)/1000 +" Seconds");
    }
}
