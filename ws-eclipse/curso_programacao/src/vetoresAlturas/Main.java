package vetoresAlturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		String[] nomes_menor = new String[n];

		double soma_alt = 0;
		int menor = 0;
		
		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");

			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();

			System.out.print("Idade: ");
			idades[i] = sc.nextInt();

			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();

			soma_alt += alturas[i];

			if (idades[i] < 16) {
				menor += 1;
				nomes_menor[i] = nomes[i];
			}

		}

		double media = soma_alt / n;
		double porcentagem_menor = (menor * 100) / n;

		System.out.printf("Altura média: %.2f%n", media);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem_menor + "%");

		for (int i = 0; i < nomes_menor.length; i++) {
			if (nomes_menor[i] != null) {
		        System.out.println(nomes_menor[i]);
		    }
		}
		
		
		sc.close();

	}
}
