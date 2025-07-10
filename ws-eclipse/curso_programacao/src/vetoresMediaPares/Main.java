package vetoresMediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		int[] pares = new int[n];

		double soma = 0;
		int pares_quant = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {
				pares[i] += vetor[i];
				soma += pares[i];
				pares_quant += 1;
			}

		}

		double media = soma / pares_quant;

		if (pares_quant != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR.");
		}

		sc.close();

	}
}
