package vetoresMaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		String nome_mais_velho = "";
		int idade_mais_velho = 0;
		
		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");

			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();

			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if (idades[i]>idade_mais_velho) {
				idade_mais_velho = idades[i];
				nome_mais_velho = nomes[i];
			}

		}

		System.out.printf("PESSOA MAIS VELHA: %s com %d anos.", nome_mais_velho, idade_mais_velho);
		
		sc.close();

	}
}
