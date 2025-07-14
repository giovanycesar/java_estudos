
package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n, mask;

		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();

		mask = 0b00100000;

		if ((n & mask) != 0) {
			System.out.println("6th bit is true.");
		} else {
			System.out.println("6th bit is false.");
		}

	}

}
