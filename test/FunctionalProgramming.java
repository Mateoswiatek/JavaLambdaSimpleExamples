import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {

    @Test
    public void classicProgrammingExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = 0;
        for (String name : names) {
            if (name.length() > 6) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    /*
    public interface Predicate<T> {
        boolean test(T t);
     */
    @Test
    public void functionalProgrammingExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = names.stream().filter(name -> name.length() > 6).count();
        System.out.println(counter);
    }
}