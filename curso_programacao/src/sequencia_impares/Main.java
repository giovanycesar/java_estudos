package sequencia_impares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int valor_int, contador;

		System.out.println("Digite um valor inteiro: ");
		valor_int = sc.nextInt();

		for (contador = 0; contador <= valor_int; contador++) {

			if (contador%2!=0) {
				System.out.println(contador);
			}
		}

		sc.close();

	}

}
