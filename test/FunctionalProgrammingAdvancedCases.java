
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgrammingAdvancedCases {

    @Test
    public void mapExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    public void limitAndSort() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");

        List<String> collect = names.stream()
                .filter(s -> s.length() > 6)
                .limit(3)
                .map(String::toUpperCase).
                sorted((o1, o2) -> o1.length() - o2.length()).
                collect(Collectors.toList());

        System.out.println(collect);
    }

    @Test
    public void statistics() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalInt optionalInt = numbers.stream()
                .mapToInt(x -> x)
                .max();
        System.out.println(optionalInt);

        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}