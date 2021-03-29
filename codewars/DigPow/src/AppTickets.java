
public class App {

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
        return "YES";
    }
}
