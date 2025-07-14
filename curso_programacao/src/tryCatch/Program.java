package tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		method01();

		System.out.println("End of program.");

	}

	public static void method01() {
		method02();
	}

	public static void method02() {

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");

			int position = sc.nextInt();

			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid Position.");
			e.printStackTrace();
			sc.next();

		} catch (InputMismatchException e) {

			System.out.println("Input Error.");

		}

		sc.close();

	}

}
