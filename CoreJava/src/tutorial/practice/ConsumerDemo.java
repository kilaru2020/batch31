package tutorial.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer o) -> {
            System.out.println("I am consuming " + o);
        };
//        Consumer<Integer> integerConsumer = consumer.andThen(consumer);
//        integerConsumer.accept(10);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers.stream().forEach(consumer);
    }
}
