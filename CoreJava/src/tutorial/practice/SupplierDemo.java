package tutorial.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            return (40);
        };

        System.out.println(supplier.get());


        List<Integer> integers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        Integer integer = integers.stream().findAny().orElseGet(supplier);
        System.out.println(integer);
    }
}
