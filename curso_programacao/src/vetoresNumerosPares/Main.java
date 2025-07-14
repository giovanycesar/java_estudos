package vetoresNumerosPares;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];
		ArrayList<Integer> numeros_pares = new ArrayList<>();

		int quantidade = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				numeros_pares.add(numeros[i]);
				quantidade += 1;
			}

		}

		System.out.println("NUMEROS PARES: ");

		for (int i = 0; i < numeros_pares.size(); i++) {
			System.out.print(numeros_pares.get(i) + " ");
		}
		
		System.out.println();

		System.out.println("QUANTIDADE DE PARES = " + quantidade);

		sc.close();

	}
}
