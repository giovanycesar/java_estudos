package divisores_de_um_numero;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int contador, valor_int;

		System.out.println("Digite um valor: ");
		valor_int = sc.nextInt();

		for (contador = 1; contador <= valor_int; contador++) {

			if (valor_int % contador == 0) {
				System.out.println(contador);
			}

		}

		sc.close();
	}

}
