
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {
		Person person1 = new Person("A", 12);
		Person person2 = new Person("B", 14);
		Person person3 = new Person("C", 16);
		Person person4 = new Person("D", 18);
		Person person5 = new Person("E", 20);
		Person person6 = new Person("F", 12);
		Person person7 = new Person("G", 12);
		Person person8 = new Person("H", 12);
		Person person9 = new Person("A", 13);
		Person person10 = new Person("Z", 80);

		List<Person> listPersons = new ArrayList<>(List.of(new Person("Y", 79), new Person("W", 78)));
		listPersons.add(person1);
		listPersons.add(person2);
		listPersons.add(person3);
		listPersons.add(person4);
		listPersons.add(person5);
		listPersons.add(person6);
		listPersons.add(person7);
		listPersons.add(person8);
		listPersons.add(person9);
		listPersons.add(person10);

		// // Escribir de memoria
		// listPersons.sort((p1, p2) -> {
		// Integer age1 = (p1).getAge();
		// Integer age2 = (p2).getAge();
		//
		// int lastCompare = age1.compareTo(age2);
		//
		// if (lastCompare != 0) {
		// return lastCompare;
		// }
		//
		// String name1 = p1.getName();
		// String name2 = p2.getName();
		//
		// return name1.compareTo(name2);
		//
		// });

		listPersons.sort((personA, personB) -> personB.getName().compareTo(personA.getName()));
		System.out.println(listPersons);
		listPersons.sort((personA, personB) -> personA.getAge().compareTo(personB.getAge()));
		System.out.println(listPersons);
		// Comparator<Person> compareByName =
		// Comparator.comparing(Person::getName).thenComparing(Person::getAge);

		// Comparator<Person> comparadorName = (personA, personB) ->
		// personA.getName().compareTo(personB.getName());
		// System.out.println(listPersons);

		Persona pa1 = new Persona("pedro", "perez", "gomez");
		Persona pa2 = new Persona("angel", "alvarez", "zamora");
		Persona pa3 = new Persona("ana", "perez", "jimenez");
		Persona pa4 = new Persona("ana", "sainz", "jimenez");
		Persona pa5 = new Persona("maria", "alvarez", "alvarez");

		List<Persona> lista = Arrays.asList(pa1, pa2, pa3, pa4, pa5);

		Comparator<Persona> comparadorA = (pa, pb) -> pa.getApellido1().compareTo(pb.getApellido1());
		Comparator<Persona> comparadorB = comparadorA
				.thenComparing((pa, pb) -> pa.getApellido2().compareTo(pb.getApellido2()));
		lista.sort(comparadorB);

		lista.forEach(System.out::println);
	}

	public static class Person {
		private String name;
		private Integer age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public Integer getAge() {
			return age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

	}

	public static class Persona {

		private String nombre;
		private String apellido1;
		private String apellido2;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public Persona(String nombre, String apellido1, String apellido2) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
		}
	}
}
