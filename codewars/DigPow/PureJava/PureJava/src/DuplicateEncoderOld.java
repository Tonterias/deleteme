import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoderOld {
    public static void main(String[] args) {
        // https://howtodoinjava.com/java/string/find-duplicate-characters/
        String blogName = "Prespecialized";
        char[] chars = blogName.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        String result = "";
        for (char c : chars) {
            if (map.get(c) > 1) {
                result = result + ")";
            } else {
                result = result + "(";
            }
        }

        System.out.println(result);

        System.out.println("Duplicate characters excluding white space :");

        // Print duplicate characters excluding white space
        for (char c : map.keySet()) {
            if (map.get(c) > 1 && !Character.isWhitespace(c)) {
                System.out.println(c);
            }
        }

        System.out.println("Distinct characters:");

        // Print distinct characters
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
            }
        }
    }
}
