
public class RangeExtraction {
    public static void main(String[] args) {

        // A format for expressing an ordered list of integers is to use a comma
        // separated list of either

        // individual integers
        // or a range of integers denoted by the starting integer separated from the end
        // integer in the range by a dash, '-'. The range includes all integers in the
        // interval including both endpoints. It is not considered a range unless it
        // spans at least 3 numbers. For example "12,13,15-17"
        // Complete the solution so that it takes a list of integers in increasing order
        // and returns a correctly formatted string in the range format.

        // Example:

        // Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9,
        // 10, 11, 14, 15, 17, 18, 19, 20})
        // # returns "-6,-3-1,3-5,7-11,14,15,17-20"

        int[] sequence = new int[] { -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20 };
        // int[] sequence = new int[] { -3, -2, -1, 2, 10, 15, 16, 18, 19, 20 };
        // int[] sequence = new int[] { 1, 2, 3, 4, 5, 7, 9 };
        System.out.println(sequence(sequence));
    }

    // public static String sequence(int[] arr) {

    // return "a";
    // }

    public static String sequence(int[] arr) {
        // Voy a recorrer el array y si el siguiente al que estoy mirando NO está en la
        // lista, entonces lo meto en la nueva lista. Si está en la lista, creo un - y
        // espero hasta que haya uno que no sea sucesivo y cierro la -
        // Crear un nuevo array o un StringBuilder con Append?
        // int[] sequence = new int[] { 1, 3, 5, 6, 7, 8, 14, 17, 20 };
        StringBuilder strb = new StringBuilder();
        boolean isStarting = true;
        for (int i = 0; i <= arr.length - 3; i++) {
            // System.out.println(strb.toString());
            if (i != arr.length - 3) {
                // System.out.println(
                // "Is continuo-> id: " + i + " -> element1: " + arr[i] + " next: " + arr[i + 1]
                // + " next+1: "
                // + arr[i + 2] + " Continuous?: " + isContinous(i, arr) + " Starting: " +
                // isStarting);
                if (isContinous(i, arr) == true) {
                    if (isStarting == true) {
                        strb.append(arr[i] + "-");
                        isStarting = false;
                    } else {
                        continue;
                    }
                } else {
                    if (isStarting == true) {
                        strb.append(arr[i] + ",");
                    } else {
                        strb.append(arr[i + 1] + ",");
                        isStarting = true;
                        i++;
                        continue;
                    }
                }
            } else {
                // System.out.println(
                // "Is continuo-> id: " + i + " -> element1: " + arr[i] + " next: " + arr[i + 1]
                // + " next+1: "
                // + arr[i + 2] + " Continuous?: " + isContinous(i, arr) + " Starting: " +
                // isStarting);
                if (isContinous(i, arr) == true) {
                    if (isStarting == true) {
                        strb.append(arr[i] + "-" + arr[i + 2]);
                        isStarting = false;
                    } else {
                        strb.append(arr[i + 2]);
                    }
                } else {
                    strb.deleteCharAt(strb.length() - 1);
                    strb.append(arr[i] + "," + arr[i + 1] + "," + arr[i + 2]);
                }
            }
        }
        return strb.toString();
    }

    private static boolean isContinous(int i, int[] arr) {
        if (arr[i] == arr[(i + 1)] - 1) {
            return true;
        } else {
            return false;
        }
    }

    // private static boolean isContinous(int i, int[] arr) {
    // return (arr[i] == arr[(i + 1)] - 1 && arr[(i + 1)] - 1 == arr[(i + 2)] - 2) ? true : false;
    // }
}
