package jrout.tutorial.batch31.thread;

import java.util.stream.IntStream;

public class ThreadExecutor {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,7).forEach(System.out::println);
        IntStream.iterate(0, i -> i+2)
                .limit(100)
                .forEach(System.out::println);
        IntStream.rangeClosed(2,7)
                .map(i -> i*i)
                .forEach(System.out::print);
    }
}