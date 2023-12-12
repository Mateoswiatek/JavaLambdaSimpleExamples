import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgrammingAttend {

    @Test
    public void lambdaExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // cheating "final" by using an array and referencing the first element. final checks a reference to the array, not the elements themselves.
        final Integer integer[] = {2};

        Stream<Integer> integerStream = numbers.stream()
                .map(number -> number * integer[0]);

        integer[0] = 22;

        integerStream.forEach(System.out::println); // lazy Initialization "problem"

    }
    @Test
    public void imutableLambdaExample(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println("==============");
        System.out.println(numbers); // Lambda does not modify the elements in the array.
    }

    @Test
    public void saveLambdaExample(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println("==============");
        System.out.println(collect);
    }

}
