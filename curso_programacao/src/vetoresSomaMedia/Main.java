package vetoresSomaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();

		}

		System.out.print("Valores: ");

		double soma = 0;

		for (int i = 0; i < vect.length; i++) {

			System.out.print(vect[i] + " ");

			soma += vect[i];

		}
		
		System.out.println();
		
		System.out.print("Soma: " + soma);
		
		System.out.println();
		
		double media = soma/n;
		
		System.out.print("Média: " + media);

		sc.close();

	}
}
