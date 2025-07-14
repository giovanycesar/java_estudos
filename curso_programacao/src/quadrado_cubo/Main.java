package quadrado_cubo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int contador, valor_int, quadrado, cubo;

		System.out.println("Digite um valor: ");
		valor_int = sc.nextInt();

		for (contador = 1; contador <= valor_int; contador++) {

			quadrado = contador*contador;
			cubo = contador*contador*contador;
			
			System.out.print(contador + " ");
			System.out.print(quadrado + " ");
			System.out.print(cubo);
			System.out.println();

		}

		sc.close();
	}

}
