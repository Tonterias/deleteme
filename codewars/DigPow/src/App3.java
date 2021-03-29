import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App3 {
    public static void main(String[] args) {
        System.out.println("============  Streams  ================");
        List<Integer> listNum = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        listNum.stream().forEach(System.out::print);

        System.out.println("Count: " + Stream.of(1, 2, 3, 4, 5).count());

        System.out.println("Distinct: " + Stream.of(2, 2, 4, 4, 4, 5, 5, 6, 6, 6).distinct().count());

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(n -> n > 3).forEach(System.out::println);

        // Optional Stream.of(1,2,3,4,5,6,7,8).findAny(n ->
        // n>6).forEach(System.out::println);

        Stream.generate(() -> "Helloouu").limit(3).forEach(System.out::println);

        // System.out.println("Ejercicio CoP");
        // List<String> personas = new ArrayList<String>();
        // personas.add("Antonio");
        // personas.add("Bernardo");
        // personas.add("Carlos");
        // personas.add("Daniel");
        // personas.add("Fernardo");
        // personas.add("Gabriel");

        // for (String string : personas) {
        // System.out.println("Persona: " + string + " chars: " + string.length());
        // }

        // personas.removeIf(s -> s.length() > 7);
        // personas.forEach(System.out::println);

        // personas.replaceAll(s -> "hijo de " + s);
        // personas.forEach(System.out::println);

        // // Remove all items outside the range 0-10.
        // // Add 100 to each item.
        // // Display the resulting list.

        // var list = new ArrayList<>(List.of(1, 5, 9, 1000, 3, 6, -20, 4));
        // list.removeIf(n -> n > 10 || n < 0);
        // list.replaceAll(n -> n + 100);
        // list.forEach(System.out::println);
    }

}
