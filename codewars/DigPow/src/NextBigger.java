import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NextBigger {

    public static void main(String[] args) {
        // nextBigger(num: 513) // returns 531
        long n = 513;

        System.out.println("Resultado: " + nextBigger(n));

    }

    private static long nextBigger(long n) {
        return LongStream
                .range(n + 1, Long.valueOf(
                        new StringBuilder(Stream.of(String.valueOf(n).split("")).sorted().collect(Collectors.joining()))
                                .reverse().toString())
                        + 1)
                .filter(v -> Stream.of(String.valueOf(n).split("")).sorted().collect(Collectors.joining())
                        .equals(Stream.of(String.valueOf(v).split("")).sorted().collect(Collectors.joining())))
                .findFirst().orElse(-1);

        // if (n < 10) {
        // return -1;
        // }

        // final StringBuilder stbdr = new StringBuilder();

        // final String str = String.valueOf(n);
        // for (int i = str.length() - 1; i > 0; i--) {

        // final int digit = Character.getNumericValue(str.charAt(i - 1));
        // if (digit < Character.getNumericValue(str.charAt(i))) {

        // int smallestLargerDigit = 9;
        // int indexOfSmallestLargerDigit = 0;
        // for (int j = i; j < str.length(); j++) {
        // final int actualDigit = Character.getNumericValue(str.charAt(j));
        // if (actualDigit > digit && actualDigit <= smallestLargerDigit) {
        // smallestLargerDigit = actualDigit;
        // indexOfSmallestLargerDigit = j;
        // }
        // }

        // final ArrayList<Integer> digits = new ArrayList<>();
        // for (int j = i - 1; j < str.length(); j++) {
        // if (j != indexOfSmallestLargerDigit) {
        // digits.add(Character.getNumericValue(str.charAt(j)));
        // }
        // }

        // stbdr.append(str.substring(0, i - 1));
        // stbdr.append(smallestLargerDigit);

        // Collections.sort(digits);
        // for (int actualDigit : digits) {
        // stbdr.append(actualDigit);
        // }
        // return Long.parseLong(stbdr.toString());
        // }
        // }
        // return -1;
    }
}
