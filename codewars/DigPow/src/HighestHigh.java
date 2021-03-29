import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;

public class HighestHigh {
    public static void main(String[] args) {
        // Defino un máximo como que antes y después no hay valores mayores y los marco
        // en la secuencia con el valor del index i

        int[] sequence = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4, 6, 9, 8, 7, 5, 8, 10, 12, 13, 11, 6, 4, 8, 3, 1,
                6 };
        sequence(sequence);
        System.out.println("Resultado SIN Streams: ");
        // System.out.println("Sin Streams: " +mss(sequence));
    }

    public static ArrayList<Integer> sequence(int[] arr) {
        System.out.println(" HIGHEST HIGH " + arr.length);
        ArrayList<Integer> relHigh = new ArrayList<Integer>();
        ArrayList<Integer> relLow = new ArrayList<Integer>();
        ArrayList<Integer> hestHigh = new ArrayList<Integer>();
        ArrayList<Integer> lestLow = new ArrayList<Integer>();
        int highest = -9999999;
        int lowest = 9999999;
        for (int i = 1; i < arr.length - 2; i++) {
            // System.out.println(" I: " + i + " : " + arr[i]);
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                relHigh.add(arr[i]);
                System.out.println("RelHigh I: " + i + " : " + arr[i]);
                if (arr[i] > highest) {
                    hestHigh.add(arr[i]);
                    highest = arr[i];
                    System.out.println("HH I: " + i + " : " + arr[i]);
                }
            }
            if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                relLow.add(arr[i]);
                System.out.println("RelLow I: " + i + " : " + arr[i]);
                if (arr[i] < lowest) {
                    lestLow.add(arr[i]);
                    lowest = arr[i];
                    System.out.println("LL I: " + i + " : " + arr[i]);
                }
            }
        }

        for (Integer integer : relHigh) {
            System.out.println("relHigh: " + integer);
        }
        for (Integer integer : relLow) {
            System.out.println("relLow: " + integer);
        }
        for (Integer integer : hestHigh) {
            System.out.println("hestHigh: " + integer);
        }
        for (Integer integer : lestLow) {
            System.out.println("lestLow: " + integer);
        }

        return relHigh;
    }
}
