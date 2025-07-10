package vetoresDadosPessoais;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		double menor_altura = 2.50;
		double maior_altura = 0;
		double soma_alt = 0;
		int num_homens = 0;
		int num_mulheres = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();

			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);

			if (alturas[i] < menor_altura) {
				menor_altura = alturas[i];
			}

			if (alturas[i] > maior_altura) {
				maior_altura = alturas[i];
			}

			if (generos[i] == 'F') {
				soma_alt += alturas[i];
				num_mulheres += 1;
			} else {
				num_homens += 1;
			}

		}

		double media_alt = soma_alt / num_mulheres;

		System.out.printf("Menor altura = %.2f%n", menor_altura);
		System.out.printf("Maior altura = %.2f%n", maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media_alt);
		System.out.println("Numero de homens = " + num_homens);

		sc.close();

	}
}
