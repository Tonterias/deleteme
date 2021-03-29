import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateEncoder {
    public static void main(String[] args) {
        // https://howtodoinjava.com/java/string/find-duplicate-characters/
        // String blogName = "Prespecialized";
        // char[] chars = blogName.toLowerCase().toCharArray();

        char[] list = { 'a', 'c', 'e' };
        Stream<Character> stream = IntStream.range(0, list.length).mapToObj(i -> list[i]);
        stream.forEach(str -> System.out.println(str + " "));

        // Map<Character, Integer> map = new HashMap<>();
        // for (char c : chars) {
        // if (map.containsKey(c)) {
        // int counter = map.get(c);
        // map.put(c, ++counter);
        // } else {
        // map.put(c, 1);
        // }
        // }
        // String result = "";
        // for (char c : chars) {
        // if (map.get(c) > 1) {
        // result = result + ")";
        // } else {
        // result = result + "(";
        // }
        // }

        // System.out.println(result);

        // System.out.println("Duplicate characters excluding white space :");

        // // Print duplicate characters excluding white space
        // for (char c : map.keySet()) {
        // if (map.get(c) > 1 && !Character.isWhitespace(c)) {
        // System.out.println(c);
        // }
        // }

        // System.out.println("Distinct characters:");

        // // Print distinct characters
        // for (char c : map.keySet()) {
        // if (map.get(c) == 1) {
        // System.out.println(c);
        // }
        // }
    }
}
