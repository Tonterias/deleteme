import java.text.SimpleDateFormat;
// import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeStreaming {
    public static void main(String[] args) {
        // Buscar el primer millon de números primos.
        int counter = 0;
        long max = Long.MAX_VALUE;
        String timeStampStart = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
        System.out.println("Start: " + timeStampStart);

        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                counter++;
                // System.out.println("Número primo: " + counter + " :" + i);
                if (counter >= 1_000_000) {
                    break;
                }
            } else {
                continue;
            }
        }

        // D:\BasuraTemporal\Programacion\codewars\DigPow> d: && cd
        // d:\BasuraTemporal\Programacion\codewars\DigPow && cmd /C
        // "c:\Users\masua\.vscode\extensions\vscjava.vscode-java-debug-0.32.0\scripts\launcher.bat
        // "C:\Program Files\Java\jdk-11.0.5\bin\java.exe" -Dfile.encoding=UTF-8
        // @C:\Users\masua\AppData\Local\Temp\cp_aoh297cu4jaoi0rk1wjwq19q5.argfile
        // PrimeStreaming "
        // Start: 2021.03.16.17.35.47.557
        // End : 2021.03.16.17.37.34
        // Start: 2021.03.16.17.35.47.557

        // IntStream.rangeClosed(2, 1_000_000).filter(x ->
        // isPrime8(x)).boxed().collect(Collectors.toList());
        String timeStampEnd = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println("End  : " + timeStampEnd);
        System.out.println("Start: " + timeStampStart);

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

    // Java 8 way to check if the number is prime or not
    private static boolean isPrime8(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
        
        // boolean res = IntStream.range(2, number).noneMatch(i -> number % i == 0);
        // boolean default = false;
        // if (number > 1 && res) {
            // default = res;
            // }

        // .range repite como en el .iterate y lo que los diferencia son las cosas que
        // vas a poder hacer luego.
        // en .range le he tenido que especificar el inicial y el final
        // noneMatch está filtrando los que son Primos y rechazando los que cumplen
        // number % i == 0
    }
}