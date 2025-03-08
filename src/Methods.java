import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {

    public static void main(String[] args) {
        Function<String, String> function1 = s -> s + s;
        System.out.println(function1.apply("Hallo"));

        Predicate<String> predicate = s -> s.contains("a");
        System.out.println(predicate.test("Hallo"));

        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(5);

        Supplier<Integer> supplier = () -> {return 5;};
        System.out.println(supplier.get());
    }
}
