import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

// The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.

// Examples:
// findNb(1071225) --> 45

public class FindNbApp {

    public static void main(String[] args) {
        long nb = 9L;

        System.out.println("Resultado: " + findNb2(nb));
        System.out.println("Resultado: " + findNb(nb));

    }

    private static int findNb(long m) {
        System.out.println("valor: " + m);
        // Tengo que hacer un stream que vaya recorriendo mientras m sea >0
        // y restando a la cantidad el math.pow
        // luego acabar en el return.

        long resultado = LongStream.rangeClosed(m, 1).reduce(1,
                (long subtot, long item) -> item - (long) Math.pow(subtot, 3));
        System.out.println("Hecho ahora: " + resultado);

        return 1;
    }

    private static int findNb2(long m) {
        // System.out.println("valor: " + nb);

        int i = 1;
        while (m > 0) {
            m = m - (long) Math.pow(i, 3);
            i++;
            // System.out.println("Elevado: " + i + " " + nb);
        }
        return m < 0 ? -1 : i - 1;
    }
}
