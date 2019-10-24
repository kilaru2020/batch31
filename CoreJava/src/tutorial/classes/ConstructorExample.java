package tutorial.classes;

import tutorial.classes.pojo.Worker;

public class ConstructorExample {
    public static void main(String[] args) {
//        Worker worker = new Worker(100);
//        worker.details();
//        System.out.println(System.lineSeparator());
//        Worker worker1 = new Worker(101,"Ramu");
//        worker1.details();
//        System.out.println(System.lineSeparator());
        Worker worker2 = new Worker(102,"Viju","Painter");
        System.out.println(worker2);

        //Worker worker = new Worker();
    }
}

