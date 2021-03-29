import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class ValidParentheses {
    public static void main(String[] args) {

        String parens = "())(";
        System.out.print("El resultado es: ");
        System.out.println(validParentheses(parens));

        // Write a function that takes a string of parentheses, and determines if the
        // order of the parentheses is valid. The function should return true if the
        // string is valid, and false if it's invalid.
        // "()" => true
        // ")(()))" => false
        // "(" => false
        // "(())((()())())" => true

        // saco los chars y luego compruebo si antes de cada ) hay un ( antes y si suman
        // lo mismo.
        // Contar los ) son negativos -1 y los ( son +1. El total no puede ser menor q 0

    }

    // public static boolean validParentheses(String parens) {
        // System.out.println("==== ValidParentheses =====: " + parens);

        // IntStream intStream = parens.chars();
        // Stream<Character> charStream = parens.chars().map(c -> (char) c);
        // intStream.forEach(System.out::println);
        // Estaba convirtiendolo a intStream (int) y no a objeto char (para eso necesito mapToObj)
        // intStream.mapToObj(c -> (char) c).forEach(System.out::println);

        // System.out.println(intStream.mapToObj(c -> (char) c).filter(c -> c.equals('(')).count());
        // System.out.println(intStream.mapToObj(c -> (char) c).filter(c -> c.equals(')')).count());

        // return true;

        // int total = 0;
        // char[] array_chars = parens.toCharArray();

        // for (char character : array_chars) {
        //     if (character == '(') {
        //         total++;
        //     } else if (character == ')') {
        //         total--;
        //     }
        //     if (total < 0) {
        //         return false;
        //     }
        // }
        // return (total == 0) ? true : false;
 
    // }

    // ==================================================================================================

    // public static boolean solve(String arg){
    // if (arg == null || arg.isEmpty()) {
    // return true;
    // }

    // List<Integer> integers = arg.chars().filter(i -> ((char)i == ')') || ((char)i == '('))
    // .map(i -> ((char)i == '(') ? 1 : -1 )
    // .boxed()
    // .collect(Collectors.toList());
    // int sum = 0;
    // for (int i : integers){
    // sum += i;
    // if (sum < 0) return false;
    // }
    // return sum == 0;
    // }

    // ==================================================================================================

    public static boolean validParentheses(String parens) {
        // System.out.println("========= ValidParentheses =================: " +
        // parens);

        int total = 0;
        char[] array_chars = parens.toCharArray();

        for (char character : array_chars) {
            if (character == '(') {
                total++;
            } else if (character == ')') {
                total--;
            }
            if (total < 0) {
                return false;
            }
        }
        return (total == 0) ? true : false;
    }

    // ==================================================================================================

        @Test
        public void sampleTest() {
            // assertEquals("expected", "actual");
            assertEquals(true, ValidParentheses.validParentheses("()"));
            assertEquals(false, ValidParentheses.validParentheses("())"));
            assertEquals(true, ValidParentheses.validParentheses("32423(sgsdg)"));
            assertEquals(false, ValidParentheses.validParentheses("(dsgdsg))2432"));
            assertEquals(true, ValidParentheses.validParentheses("adasdasfa"));
        }
    
}

// public static boolean validParentheses(String parens) {
// System.out.println("========= ValidParentheses =================: " +
// parens);

// int total = 0;
// // int countOpenPar = 0;
// // int countClosePar = 0;
// char[] array_chars = parens.toCharArray();

// for (char character : array_chars) {
// if (character == '(') {
// // countOpenPar++;
// total++;
// } else if (character == ')') {
// // countClosePar++;
// total--;
// }
// // else {
// // System.out.println("Char: " + character);
// // }
// // System.out
// // .println("total: " + total + " countOpenPar: " + countOpenPar + "
// // countClosePar: " + countClosePar);
// }
// // if (total == 0) {
// // return true;
// // } else {
// // return false;
// // }

// return (total == 0) ? true : false;
// }