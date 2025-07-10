package denominador_zero;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidade, contador, valor_int1, valor_int2, divisao;

		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();

		for (contador = 0; contador < quantidade; contador++) {

			System.out.println("Digite o primeiro valor: ");
			valor_int1 = sc.nextInt();

			System.out.println("Digite o segundo valor: ");
			valor_int2 = sc.nextInt();

			if (valor_int2 != 0) {
				divisao = valor_int1 / valor_int2;
				System.out.println(valor_int1 + "/" + valor_int2 + " = " + divisao);
			} else {
				System.out.println("Divisao impossivel.");
			}

		}

		sc.close();

	}

}
