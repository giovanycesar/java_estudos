package valores_em_intervalo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidade, valor_int, contador, dentro, fora;

		dentro = 0;
		fora = 0;

		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();

		for (contador = 0; contador < quantidade; contador++) {

				System.out.println("Digite um valor: ");
				valor_int = sc.nextInt();

				if (valor_int >= 10 && valor_int <= 20) {
					dentro += 1;
				} else {
					fora += 1;
				}
		}

		System.out.println(dentro + " dentro.");
		System.out.println(fora + " fora.");

		sc.close();

	}

}
