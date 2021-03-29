import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class App2 {
    // public static void main(String[] args) throws Exception {
    public static void main(String[] args) {

        String s = "abc-abcd";
        String result = "";
        // using simple for loop
        for (int i = 0; i < s.length(); i++) {
            // meto el char en un array y luego lo recorro para ver si lo tengo
            Set<Character> charset = new HashSet<Character>();
            // charset.add("a");
            // charset.forEach(System.out::println);
            // if (charset.contains("z")) {
            // System.out.println("contiene a");
            // } else {
            // System.out.println("No con a");
            // }
            // Set<Character> charset = Set.<Character>of();
            if (charset.contains(s.charAt(i))) {
                System.out.println("contiene: " + s.charAt(i));
                result = result + ")";
                System.out.println("Result: " + result);
            } else {
                System.out.println("NO contiene: " + s.charAt(i));
                // charset.add(String.valueOf((s.charAt(i))));
                System.out.println("Debería meterlo");
                charset.forEach(System.out::println);
                result = result + "(";
                System.out.println("Result: " + result);

            }
        }

        // ArrayList<Character> chars = new ArrayList<Character>(); // Create an
        // ArrayList object
        // chars.add(s.charAt(i));
        // System.out.println(s.charAt(i));
        // }
        System.out.println(result);
        // int[] listInt = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        // Integer result = Stream.min(comparator).orElse(0);
        // String[] myStrigs = { "a", "ba", "aac" };
        // Stream<String> streamString = Stream.of(myStrigs);
        // streamString.forEach(p -> System.out.println(p));
        // Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // stream.forEach(p -> System.out.println(p));

        // Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9
        // });
        // stream.forEach(p -> System.out.println(p));
        // Collection<String> strings = myStrigs.;
        // Optional<String> longest =
        // streamString.stream().max(Comparator.comparingInt(String::length));
        // System.out.println("El largo es: " + longest);

        // List<Integer> list = new ArrayList<Integer>();

        // for (int i = 1; i < 10; i++) {
        // list.add(i);
        // }

        // Stream<Integer> stream = list.stream();
        // stream.forEach(p -> System.out.println(p));

        // Stream<Integer> randomNumbers = Stream.generate(() -> (new
        // Random()).nextInt(100));

        // randomNumbers.limit(20).forEach(System.out::println);
    }

    // EXAMPLE STREAM OF
    // String[] myStrigs = { "a", "ba", "aac" };
    // Stream<String> streamString = Stream.of(myStrigs);
    // streamString.forEach(p -> System.out.println(p));
    // Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    // stream.forEach(p -> System.out.println(p));

    // MAIN:
    // final Random random = new Random();
    // Supplier<Integer> supp = () -> {
    // Integer result = random.nextInt();
    // System.out.println("Supplying: " + result + ")");
    // return result;
    // };
    // System.out.println("\n Test 1=================================");
    // Stream<Integer> randoms = Stream.generate(supp);
    // System.out.println("First stream built");
    // randoms.filter(n -> n >= 0).limit(2).forEach(System.out::println);

    // static Integer lambda(String a, String b) {
    // String a = "c";
    // String b = "a";
    // System.out.println(lambda(a, b)); // true

    // return Integer.compare(a.length(), b.length());
    // // Comparator<String> byLength = (String a, String b) -> {
    // // return Integer.compare(a.length(), b.length()); };
    // }

    //
    // String a = "the_Stealth_Warrior";
    // System.out.println(toCamelCase(a)); // true
    //
    // static String toCamelCase(String str) {
    // // String[] array = str.split("[-+*/=_]");
    // // String each = "";
    // // for (var i = 0; i < array.length; i++) {
    // // if (i == 0) {
    // // each = each + array[i];
    // // } else {
    // // each = each + array[i].substring(0, 1).toUpperCase() +
    // array[i].substring(1);
    // // }
    // // }
    // // return each;
    // String[] words = str.split("[-_]");
    // return Arrays.stream(words, 1, words.length)
    // .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
    // .reduce(words[0], String::concat);

    // }
}

// Complete the method/function so that it converts dash/underscore delimited
// words into camel casing. The first word within the output should be
// capitalized only if the original word was capitalized (known as Upper Camel
// Case, also often referred to as Pascal case).

// Examples
// toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

// toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"