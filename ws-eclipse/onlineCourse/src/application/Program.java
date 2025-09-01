package application;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String[] courses = { "A", "B", "C" };

		Set<Integer> set = new LinkedHashSet<>();
		
		int lastStudent = 0;

		for (int i = 0; i < courses.length; i++) {

			System.out.print("How many students for course " + courses[i] + "? ");
			int quantity = sc.nextInt();

			for (int c = 0; c < quantity; c++) {

				int student = sc.nextInt();

				set.add(student);

				lastStudent = student;

			}

		}

		System.out.println("Total students: " + set.size());

		for (Integer s : set) {
			if (s.equals(lastStudent)) {
				System.out.print(s + ".");
			} else {
				System.out.print(s + ", ");
				}
		}

		sc.close();

	}

}
