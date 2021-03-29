import java.util.Arrays;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

public class MaxSubarraySum {
    public static void main(String[] args) {
        // in finding the maximum sum of a contiguous subsequence in an array or list of integers:
        // Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        // should be 6: in the subarray {4, -1, 2, 1}

        int[] sequence = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] sequence = new int[] { -2, 9, -3, 4, -1, 2, 1, -4, 6, -3, -5, -6, 15 };
        // int[] sequence = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Con Streams: " + sequence(sequence));
        System.out.println("Sin Streams: " +mss(sequence));
    }

    public static int sequence(int[] arr) {
        final int[] max = { 0 };
        return Arrays.stream(arr).map(i -> i = max[0] = i + max[0] > 0 ? max[0] + i : 0).max().orElse(0);

        // .orElse es si no cumples las condiciones anteriores pon 0 (o hay un error)
        // .max máximo número entero entre todo el stream que está recorriendo
        // .map(i -> i = max[0] = i + max[0] > 0 ? max[0] + i : 0)
        // condicion: max[0] > 0 ? max[0] + i : 0)
    }

    public static int sequence2(final int[] array) {
        return range(0, array.length)
                .flatMap(start -> range(1, array.length - start + 1)
                        .map(subLength -> stream(array).skip(start).limit(subLength).sum()))
                .filter(sum -> sum >= 0).max().orElse(0);
    }

    static int mss(int[] arr) {
        int size = arr.length;
        int max = Integer.MIN_VALUE, inter_max = 0;

        for (int i = 0; i < size; i++) {
            inter_max = inter_max + arr[i];
            if (max < inter_max)
                max = inter_max;
            if (inter_max < 0)
                inter_max = 0;
        }
        return max;

    }
}