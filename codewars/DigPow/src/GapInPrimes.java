import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class GapInPrimes {
    public static void main(String[] args) {
        // The prime numbers are not regularly spaced. For example from 2 to 3 the gap
        // is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 2 and 50 we
        // have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31,
        // 41-43
        // g (integer >= 2) which indicates the gap we are looking for
        // m (integer > 2) which gives the start of the search (m inclusive)
        // n (integer >= m) which gives the end of the search (n inclusive)

        int g = 2;
        long m = 100;
        long n = 110;
        System.out.println(gap(g, m, n));
        System.out.println(gap3(g, m, n));
        // System.out.println(gap2(g, m, n));
    }

    public static String gap3(int g, long m, long n) {
        System.out.println("G: " + g + " M: " + m + " N: " + n);
        // 1 Tengo que montar un bucle que saque los números.
        // 2 Preguntarme si es primo o no
        // 3 Organizar la salida del Stream a lo que yo necesito.
        // - Podría pensar que los números entre m y n son mi flujo Stream.iterate() y
        // al pasarlos por
        // mi map compruebo si son primos con mi método externo, luego compruebo la
        // diferencia en otro map, ordeno y lanzo a un long
        // int seedValue = 2;
        // int limitTerms = 5;
        int seedValue = (int) m;
        int limitTerms = (int) n;
        StringBuilder strb = new StringBuilder();

        Integer last = 2;
        Integer previousLast = 2;
        List<Integer> listado = IntStream.iterate(seedValue, y -> y + 1).takeWhile(y -> y < limitTerms)
                .filter(y -> isPrime(y)).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        // al crear un nuevo ArrayList en cada iteración, luego necesita juntarlos todos.
        // .iterate está recorriendo el List inicial listado

        for (var element : listado) {
            previousLast = last;
            last = element;
            if ((last - previousLast) == g) {
                strb.append("(" + previousLast + ", " + last + ") ");
            }
        }
        System.out.println("Esto es GAP3 con Streams");
        // System.out.println(strb.toString());
        return strb.toString();
    }

    public static long[] gap(int g, long m, long n) {
        System.out.println("GAP sin Streams -> G: " + g + " M: " + m + " N: " + n);
        StringBuilder strb = new StringBuilder();
        Map<Long, Long> couples = new HashMap<>();
        long[] pairs = new long[2];
        Long last = 2L;
        Long previousLast = 2L;
        for (long i = m; i <= n; i++) {
            if (i > 1 && isPrime(i)) {
                // System.out.println("Es primo: " + i);
                previousLast = last;
                last = i;
                // System.out.println("Last: " + last + " previousLast: " + previousLast);
                if ((last - previousLast) == g) {
                    couples.put(previousLast, last);
                }
            } else {
                // System.out.println("NOOOO Es primo: " + i);
            }
        }
        // if (couples.size() == 0) {
        // System.out.println("NO HAY");
        // return max;
        // }

        for (Map.Entry<Long, Long> entry : couples.entrySet()) {
            var firstCouple = entry.getKey();
            var lastCouple = entry.getValue();
            // System.out.println("Couple: " + firstCouple + " : " + lastCouple);
            strb.append("(" + firstCouple + ", " + lastCouple + ") ");
            pairs[0] = firstCouple;
            pairs[1] = lastCouple;
        }

        // System.out.println(strb.toString());

        // System.out.println("Pairs: " + pairs.toString());

        return pairs;
    }

    private static boolean isPrime(long i) {
        // Si i es divisible entre otro que no sea 1 y el mismo, es primo. Así que vamos
        // a ir desde 2 hasta i-1 comprobando si el modulus de i% es cero
        // en algún caso. Si lo es, return false inmediatamente. Si no, continue hasta
        // que acabe de respasar todos los números.
        for (int j = 2; j < i; j++) {
            if (i >= j && i % j == 0) {
                // System.out.println("El número NO ES primo: " + i + " es divisible entre: " +
                // j + " i%j: " + i % j);
                return false;
            } else {
                continue;
            }
        }
        return true;
    }

    // public static long[] gap2(int g, long m, long n) {
    // System.out.println("G: " + g + " M: " + m + " N: " + n);
    // Long[] couples = new Long[2];
    // LinkedList<Long[]> pairs = new LinkedList<>();
    // Long last = 0L;
    // Long previousLast = 0L;
    // int k = 0;
    // for (long i = m; i <= n; i++) {
    // for (long a = 2; a < i; a++) {
    // if (i > a) {
    // if (i % a == 0) {
    // System.out.println("No Es primo: " + i + " " + (i % a));
    // break;
    // } else {
    // // System.out.println("Es primo: " + i);
    // last = i;
    // // System.out.println("last: " + last + " previousLast: " + previousLast);
    // if ((last - previousLast) == g) {
    // System.out.println("Es de los buenos: " + i + " xx: " + previousLast);
    // couples[0] = previousLast;
    // couples[1] = last;
    // pairs.add(k, couples);
    // k++;
    // }
    // previousLast = last;
    // continue;
    // }
    // }
    // }
    // }
    // if (pairs.size() == 0) {
    // System.out.println("NO HAY");
    // }
    // for (var pair : pairs) {
    // System.out.println("Parejita: " + pair[0] + ", " + pair[1]);
    // }
    // long[] max = { 0 };
    // return max;
    // }

}
