package multiplosNaoMultiplos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num_int1, num_int2;

		System.out.println("Digite um valor inteiro: ");
		num_int1 = sc.nextInt();

		System.out.println("Digite outro valor inteiro: ");
		num_int2 = sc.nextInt();

		if (num_int1 % num_int2 == 0 || num_int2 % num_int1 == 0) {
			System.out.println("SÃO MÚLTIPLOS.");
		} else {
			System.out.println("NÂO SÃO MÚLTIPLOS.");
		}

		sc.close();

	}

}
