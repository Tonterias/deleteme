import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static void main(String[] args) {

        // int[] sequence = new int[] { 1, 2, 3, 6, 4, 1, 2, 3, 2, 1 };
        int[] sequence = new int[] { 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1, 1, 2, 3, 6, 4, 1, 2, 3,
                2, 1, 1, 2, 3, 6, 4, 1, 2, 3, 2, 1 };

        System.out.println(getPeaks(sequence));
        // The output will be returned as a ``Map<String,List>with two key-value
        // pairs:"pos"and"peaks". If there is no peak in the given array, simply return
        // {"pos" => [], "peaks" => []}`.

    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        Map<String, List<Integer>> pos_peaks = new HashMap<>();

        for (int i = 1; i < arr.length - 1; i++) {
            System.out.println("I: " + i + " Value: " + arr[i]);
            if (i == 0 || i == arr.length - 1) {
                continue;
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                pos.add(i);
                peaks.add(arr[i]);
            } else if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        pos.add(i);
                        peaks.add(arr[i]);
                    }
                    if (arr[j] != arr[i]) {
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        pos_peaks.put("pos", pos);
        pos_peaks.put("peaks", peaks);

        for (Map.Entry<String, List<Integer>> entry : pos_peaks.entrySet()) {
            var monthCode = entry.getKey();
            var monthName = entry.getValue();
            System.out.println(" Key: " + monthCode + " Value: " + monthName);
        }

        return pos_peaks;
    }
}
