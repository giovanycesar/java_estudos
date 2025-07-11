package fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int contador, valor_int, fatorial;

		System.out.println("Digite um valor: ");
		valor_int = sc.nextInt();

		fatorial = valor_int;

		if (valor_int != 0) {
			
			for (contador = valor_int; contador != 1; contador--) {

				fatorial = fatorial * (contador - 1);

			}
			
			System.out.println(fatorial);

		} else {
			System.out.println("0");
		}

		sc.close();
	}

}
