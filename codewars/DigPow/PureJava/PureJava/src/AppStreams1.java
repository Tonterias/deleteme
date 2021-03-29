import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

public class AppStreams1 {

    public static void main(String[] args) {
        System.out.println("============  MAP  ================");

        var names = List.of("Olivia", "Emma", "Chloe", "Zoey", "Abigail", "Amilia");

        // names.stream().map(s -> new Person(s)).forEach(System.out::println);
        // names.stream().map(Person::new).forEach(System.out::println);

        // names.stream().peek(s ->
        // System.out.println(s)).map(Person::new).collect(Collectors.toList());

        var collectionNames = names.stream().peek(s -> System.out.println(s + " " + s.getClass())).map(Person::new)
                .peek(s -> System.out.println(s + " " + s.getClass())).collect(Collectors.toList());

        for (Person person : collectionNames) {
            System.out.println("Collection: " + person.getName());
        }
    }

}
