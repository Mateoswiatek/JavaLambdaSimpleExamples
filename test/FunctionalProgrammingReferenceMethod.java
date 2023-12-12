import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgrammingReferenceMethod {

    @Test
    public void ConsumerFull() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
    /*
    public interface Consumer<T> {
        void accept(T t);
    }
    */
    @Test
    public void ConsumerShort() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach((String name) -> System.out.println(name));
    }

    @Test
    public void ConsumerSuperShort() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(name -> System.out.println(name));
    }

    @Test
    public void referenceMethod() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(System.out::println);
    }
}