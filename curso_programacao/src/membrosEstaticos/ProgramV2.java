package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import utilMembrosEstaticos.CalculatorV2;

public class ProgramV2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CalculatorV2 calc = new CalculatorV2();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}
}
