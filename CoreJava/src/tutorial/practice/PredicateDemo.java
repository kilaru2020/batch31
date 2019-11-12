package tutorial.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer i) -> {
            return i > 5;
        };

        List<Integer> integers = Arrays.asList(1, 2,44 , 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(predicate.test(9));
//        integers.stream().filter(predicate).forEach(System.out::println);
        integers.stream().filter((i) -> i < 3).forEach(System.out::println);
    }
}
