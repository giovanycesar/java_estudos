package alturaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas alturas? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ": Qual a altura? ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + vect[i];
		}
		
		double avg = sum/n; 
		
		System.out.printf("Altura Média: %.2f%n", avg);

		sc.close();
	}

}
