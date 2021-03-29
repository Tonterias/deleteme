// import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;
// import java.util.Optional;
// import java.util.Random;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;
import java.util.Collections;

public class DigPow {

    public static void main(String[] args) {

        int inicial = 92;
        int power = 1;
        // System.out.println(digPow(inicial, power));
        System.out.println(digPowStream(inicial, power));
    }

    public static long digPow(int n, int p) {
        // digPow(46288, 3)
        int inicial = n;
        int power = p;
        int nx = inicial;

        // System.out.println("Calculando para : " + n);
        List<Integer> list = new ArrayList<Integer>();
        // int contador = 0;
        while (nx > 0) {
            // int remainder = n % 10;
            list.add(nx % 10);
            // contador = contador + 1;
            // System.out.println("remainder: " + remainder);
            int entero = (int) nx / 10;
            // System.out.println("entero: " + entero);
            nx = entero;
        }
        Collections.reverse(list);
        // System.out.println("Stack : " + list.toString());

        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            double digit = list.get(i);
            digit = Math.pow(digit, power);
            power = power + 1;
            // System.out.println(digit);
            total = digit + total;
            // System.out.println(total);
        }
        // System.out.println("inicial " + inicial);
        double result = total / inicial;
        // System.out.println(result);
        if (result == (int) result) {
            return (long) result;
        } else {
            return -1;
        }

    }

    public static long digPowStream(int n, int p) {
        // int a = n;
        // int b = p;
        // Stream<Integer> fib = Stream.of(1, 1, 2, 3, 5, 8);
        Random random = new Random();
        Stream<Integer> randoms = Stream.generate(random::nextInt);
        randoms.forEach(System.out::println);

        return 1;

    }

}

// digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
// digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92
// * k
// digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
// digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 =
// 46288 * 51
// Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) +
// ...) = n * k
// Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) +
// ...) / n = k entero sin remainder

// 1 separar el numero en digitos
// array?------------------------------------------------------
// 2 recorrer el array elevando cada cifra por 1,2,3,4,....
// 3 dividir el resultado entre la cifra inicial y ver si da un entero (sin
// remainder)

// System.out.println("Calculando para : " + n);
// int[] digitos = new int[10];
// int raiz = 0;
// while (n > 0) {
// int remainder = n % 10;
// digitos[raiz] = n % 10;
// raiz++;
// System.out.println("remainder: " + remainder);
// int entero = (int) n / 10;
// System.out.println("entero: " + entero);
// n = entero;
// }
// for (int i : digitos) {
// System.out.print(" Digitos: " + i + " ");
// }

// List<Integer> list = Arrays.stream(n.split("")).map(s ->
// Integer.valueOf(s)).collect(Collectors.toList());

// list.toString();
// System.out.println(Arrays.toString(digitos));
// intStream.of(digitos);
// Arrays.stream(digitos);

// List<Integer> list = Arrays.stream(digitos).map(s ->
// Integer.valueOf(s)).collect(Collectors.toList());
// for (int i = 0; i < digitos.length; i++) {
// System.out.println("stream" + i);
// }
// int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
// IntStream stream = Arrays.stream(arr).limit(7);
// // stream = stream.limit(7); .forEach(System.out::println)
// System.out.println("Sum of first 7 elements = " +
// stream.forEach(System.out::println));
// System.out.println("Sum of first 7 elements = " + stream.sum());