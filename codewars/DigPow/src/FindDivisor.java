import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindDivisor {

    public static void main(String[] args) {
        // Count the number of divisors of a positive integer n.
        // Random tests go up to n = 500000.

        System.out.println("=== Kata FindDivisor : https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java  =======");
        long n = 4;
        System.out.println(" Kata : FindDivisor " + findDivisor(n));
    }

    private static long findDivisor(long n) {
        long result = 0;
        return result;
    }


    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(0, FindDivisor.findDivisor(4));

    }
    public void sampleTest2() {
        // assertEquals("expected", "actual");
        assertEquals(0, FindDivisor.findDivisor(4));
    }
}
