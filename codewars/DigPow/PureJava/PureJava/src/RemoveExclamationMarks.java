import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveExclamationMarks {

    public static void main(String[] args) {

        System.out.println("============= Kata : Tickets ======================");
        String rem = "ñkk!!d";
        System.out.println(" Kata : RemoveExclamationMarks " + rmem(rem));
        System.out.println(" Kata : RemoveExclamationMarks2 " + rmem2(rem));
    }

    public static String rmem2(String rme) {

        // return Stream.of(rme.split("")).filter(l -> !l.equals("!"))
        // .collect(Collectors.joining(""));
        String[] arrOfStr = rme.split("");
        for (String a : arrOfStr)
            System.out.println(a);

        // Create a character array
        char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's' };

        // Convert the character array into String
        // using Collectors.joining() method
        String chString = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());

        // Print the concatenated String
        System.out.println(chString);
        return "qewr";
    }

    public static String rmem(String rme) {

        rme = rme.replace("!", "");
        return rme;
    }
}
