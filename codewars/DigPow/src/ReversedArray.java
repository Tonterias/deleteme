import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReversedArray {

    public static void main(String[] args) {

        System.out.println("============= Kata : ReversedArray 8 ======================");
        // 348597 => [7,9,5,8,4,3]
        int rarr = 35231;
        // System.out.println(" Kata : ReversedArray " + reversedArray(rarr));
        // System.out.println(" Kata : ReversedArray2 " + reversedArray2(rarr));
        // IntStream.rangeClosed(1, 5).limit(4).forEach(System.out::println);

        System.out.println(" Kata : ReversedArray3 " + reversedArray3(rarr));
    }

    public static int[] reversedArray(int rarr) {
        ArrayList<Integer> arLst = new ArrayList<>();
        long div = rarr;
        int dig;

        while (div != 0) {
            dig = (int) (div % 10);
            div = div / 10;
            arLst.add(dig);
        }

        int[] array = arLst.stream().mapToInt(i -> i).toArray();

        return array;
    }

    public static char[] reversedArray2(int rarr) {
        String numberString = String.valueOf(rarr);
        char[] normalArray = numberString.toCharArray();
        char[] rvsdArray = new char[normalArray.length];

        for (int i = normalArray.length - 1; i >= 0; i--) {
            System.out.println(normalArray[i]);
            int x = (normalArray.length - (Math.abs(normalArray.length - i)));
            rvsdArray[x] = normalArray[i];
        }
        for (int i = 0; i < normalArray.length; i++) {
            System.out.println("Arreglada: " + normalArray[i]);
        }
        return rvsdArray;

    }

    public static int[] reversedArray3(int rarr) {
        System.out.println("Inicial: " + rarr);
        var array = String.valueOf(rarr).chars().map(x -> x - 48).toArray();
        // IntStream.rangeClosed(1, array.length).forEach(System.out::println);
        IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).forEach(System.out::println);
        var reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        for (int j : reversedArray) {
            System.out.println("I: " + j);
        }
        return reversedArray;
    }

    public static int[] reversedArray4(int rarr) {
        return new StringBuilder(String.valueOf(rarr)) //
                .reverse() //
                .toString() //
                .chars() //
                .mapToObj(ch -> Character.toString((char) ch)) //
                .mapToInt(Integer::parseInt) //
                .toArray();
        // String numberString = String.valueOf(rarr);
        // var b = stream().map(p -> Integer.parseInt(p)).collect(Collectors.toList());
        // char[] normalArray = numberString.toCharArray();
        // int[] rvsdArray = new int[normalArray.length];
        // List<String> a = new ArrayList<>(Arrays.asList((n + "").split("")));
        // List<Integer> b = normalArray.stream().map(p ->
        // Integer.parseInt(p)).collect(Collectors.toList());
        // Collections.reverse(b);
        // return convertIntegers(b);
    }

    public static int[] reversedArray5(int rarr) {

        List<Integer> l = Arrays.stream(String.valueOf(rarr).split("")).map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());
        Collections.reverse(l);

        return l.stream().mapToInt(Integer::intValue).toArray();
    }

}
