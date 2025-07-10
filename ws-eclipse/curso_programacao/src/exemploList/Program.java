package exemploList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("------------------------");

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		
		for (String obj : result) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
	}

}
