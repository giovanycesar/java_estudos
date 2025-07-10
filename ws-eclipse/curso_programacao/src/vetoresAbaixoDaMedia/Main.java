package vetoresAbaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		double soma = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();

			soma += vetor[i];

		}
		
		double media = soma / n;

		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < n; i++) {

			if (vetor[i]<media) {
				System.out.printf("%.1f%n", vetor[i]);
			}

		}


		sc.close();

	}
}
