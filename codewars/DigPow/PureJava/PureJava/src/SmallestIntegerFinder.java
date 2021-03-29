import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SmallestIntegerFinder {

    public static void main(String[] args) {

        System.out.println("============= Kata : SmallestIntegerFinder 8 ======================");
        // Given [34, -345, -1, 100] your solution will return -345
        int[] argsw = { 34, -345, -1, 100 };

        System.out.println(" Kata : SmallestIntegerFinder " + findSmallestInt8(argsw));
    }

    public static int findSmallestInt8(int[] args) {
        // return Arrays.stream(args).reduce(Math::min).orElse(Integer.MIN_VALUE);
        // return java.util.Arrays.stream(args).min().getAsInt();

        return Arrays.stream(args).reduce((a, b) -> a < b ? a : b).orElse(Integer.MIN_VALUE);
        // return Arrays.stream(args).reduce((num1, num2) -> Math.min(num1,
        // num2)).orElse(Integer.MIN_VALUE);
    }

    public static int findSmallestInt9(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

    public static int findSmallestInt10(int[] args) {
        int min = 999999999;
        for (int i : args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
