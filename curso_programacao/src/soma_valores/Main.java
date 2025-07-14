package soma_valores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int valor01, valor02, soma;
		
		
		System.out.println("Digite um valor: ");
		valor01 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor02 = sc.nextInt();
		
		soma = valor01 + valor02;
		
		System.out.println("SOMA = " + soma);
		
		
		sc.close();

	}

}
