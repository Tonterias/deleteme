
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Meeting {

    public static void main(String[] args) {
        System.out.println("===== https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java ======");

        // John has invited some friends. His list is:
        //
        // s =
        // "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        // Could you make a program that
        // makes this string uppercase
        // gives it sorted in alphabetical order by last name.

        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

        System.out.println("Result: " + meeting(s));
        System.out.println("Result2: " + meeting2(s));
        System.out.println("ResultStream: " + meetingStream(s));
        System.out.println("ResultStream2: " + meetingStream2(s));

    }

    private static String meeting2(String s) {
		String[] guests = s.split(";");
		List<Name> names = new ArrayList<Name>();
		
		Arrays.asList(guests).stream();
		Arrays.stream(guests);
		
		for (int i = 0; i < guests.length; i++) {
			String toUpperCase = guests[i].toUpperCase();
			Name person = new Name(toUpperCase);
			names.add(person);
		}
		
		for (var name : names) {
			System.out.println("NAME: " + name.toString());
		}
		
//		names.sort((name1, name2) -> {
//
//			String term1 = name1.getLast();
//			String term2 = name2.getLast();
//
//			int lastCompare = term1.compareTo(term2);
//
//			if (lastCompare != 0) {
//				return lastCompare;
//			}
//
//			term1 = (name1).getFirst();
//			term2 = (name2).getFirst();
//
//			return term1.compareTo(term2);
//
//		});

		Comparator<Name> comparator1 = (nam1, nam2) -> nam1.getLast().compareTo(nam2.getLast());
		Comparator<Name> comparator2 = comparator1.thenComparing((nam1, nam2) -> nam1.getFirst().compareTo(nam2.getFirst()));
		names.sort(comparator2);
		
//		names.sort((nam1, nam2) -> nam1.getLast().compareTo(nam2.getLast()));
//		names.sort((nax1, nax2) -> nax1.getFirst().compareTo(nax2.getFirst()));

		StringBuilder sb = new StringBuilder();
		for (Name name : names) {
			sb.append(name.toString());
		}

		return sb.toString();
	}

    private static String meetingStream2(String s) {
        // @formatter:off
		return Arrays
				.stream(s.split(";"))
//				.map(String::toUpperCase)
				.map((String s1) -> {return s1.toUpperCase();})
//				.map(Name::new)
				.map((String s2) -> {
					return new Name(s2);
				})
				.sorted(Comparator.comparing(Name::getLast)
				.thenComparing(Name::getFirst))
				.map(n -> String.format("(%s, %s)", n.getLast(), n.getFirst()))
				.collect(Collectors.joining());
		// @formatter:on
    }

    // private static String meetingStream2(String s) {
//		// @formatter:off
//		return Arrays
//				.stream(s.split(";"))
//				.map(String::toUpperCase)
//				.map(Name::new)
//				.sorted(Comparator.comparing(Name::getLast)
//				.thenComparing(Name::getFirst))
//				.map(n -> String.format("(%s, %s)", n.getLast(), n.getFirst()))
//				.collect(Collectors.joining());
//		// @formatter:on
    // }

    private static String meetingStream(String s) {
        // Stream
        // @formatter:off
		return Arrays
				.stream(s.toUpperCase().split(";"))
				.map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
				.sorted()
				.collect(Collectors.joining(""));
		// @formatter:off
	}

	public static String meeting(String s) {
		String[] guests = s.split(";");
//        String[] guests2 = new String[guests.length];
		for (int i = 0; i < guests.length; i++) {
			System.out.println("1 : " + guests[i]);
			int index = guests[i].indexOf(":");
//            guests2[i] = "(" + guests[i].substring(index+1).toUpperCase() + ", " + guests[i].substring(0,index).toUpperCase() + ")";
			guests[i] = "(" + guests[i].substring(index + 1).toUpperCase() + ", "
					+ guests[i].substring(0, index).toUpperCase() + ")";
//            System.out.println("2 : " + guests2[i]);
		}
		Arrays.sort(guests);

		return String.join("", guests);
	}

//	public static String meeting(String s) {
//
//		TreeMap<String, List> people = new TreeMap();
//		String[] persons = s.split(";");
//		for (String person : persons) {
//			String[] fullNames = person.split(":");
//			String firstName = fullNames[1].toUpperCase();
//			String secondName = fullNames[0].toUpperCase();
//
//			if (!people.keySet().contains(firstName)) {
//				List<String> names = new ArrayList<>();
//				names.add(secondName);
//				people.put(firstName, names);
//			} else if (people.keySet().contains(firstName)) {
//				List<String> names = people.get(firstName);
//				names.add(secondName);
//				Collections.sort(names);
//				people.put(firstName, names);
//			}
//
//		}
//
//		System.out.println(people);
//
//		StringBuilder result = new StringBuilder();
//		Set<String> secondNames = people.keySet();
//
//		for (String secondName : secondNames) {
//			List<String> names = people.get(secondName);
//			for (String name : names) {
//				result.append("(").append(secondName.toUpperCase()).append(", ").append(name.toUpperCase()).append(")");
//			}
//		}
//		return result.toString();
//	}
	private static class Name {
		private String first;
		private String last;

		public Name(String name) {
			String[] parts = name.split(":");
			first = parts[0];
			last = parts[1];
		}

		public String getFirst() {
			return first;
		}

		public String getLast() {
			return last;
		}

		@Override
		public String toString() {
			return "(" + last + ", " + first + ")";
		}

	}
}
