
public class Tickets {

    public static void main(String[] args) {
        // Line.Tickets(new int[] {25, 25, 50}) // => YES
        // Line.Tickets(new int[] {25, 100}) // => NO. Vasya will not have enough money
        // to give change to 100 dollars
        // Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO.
        System.out.println("============= Kata : Tickets ======================");
        int[] peopleInLine = { 25, 25, 50, 50, 100 };
        System.out.println(" Kata : Tickets " + Tickets(peopleInLine));

    }

    public static String Tickets(int[] peopleInLine) {

        // recorre array y + - y hacemos un loop sobre los billetes que quedan en caja
        // para
        // devolver el cambio. Si no hay suficienes, pues return "NO"
        // El buche empieza por los más grandes y va bajando a los más peques
        int change = 0;
        int c25 = 0;
        int c50 = 0;
        // int c100 = 0;
        for (int ticketPay : peopleInLine) {
            // System.out.println("ticket " + ticketPay);
            change = ticketPay - 25;
            if (ticketPay == 100) {
                c100 += 1;
            } else if (ticketPay == 50) {
                c50 += 1;
            } else {
                c25 += 1;
            }
            // System.out.println("Caja c25:" + c25 + " Change: " + change);
            if (change == 25) {
                c25 -= 1;
            } else if (change == 50) {
                if (c50 > 0) {
                    c50 -= 1;
                } else {
                    c25 -= 2;
                }
            } else if (change == 75) {
                if (c50 > 0) {
                    c50 -= 1;
                } else {
                    c25 -= 2;
                }
                c25 -= 1;
            }
            // System.out.println("Change c25:" + c25 + " c50: " + c50);
            if (c25 < 0 || c50 < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
