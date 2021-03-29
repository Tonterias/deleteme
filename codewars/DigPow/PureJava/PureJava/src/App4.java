import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Obtain a text file from Project Gutenberg (or anywhere else).
// Using streams, create a list of all words in the text file.

// Tips:
// First read the file using the Files class.
// Split each line into an array of strings (words)
// Transform the arrays of strings into lists of strings: use Arrays.asList()
// Flatten the data structure
// Collect the final stream together into a list.

public class App4 {

    public static void main(String[] args) {
        var intStream = IntStream.range(0, 101).sum();
        System.out.println("intStream sum : " + intStream);

        // var intStream2 = IntStream.range(0, 5).reduce(0, (subtotal, item) -> subtotal
        // + item);
        var value = IntStream.range(0, 101).reduce(0, (subtotal, item) -> subtotal + item);
        System.out.println("value: " + value);
    }
}
