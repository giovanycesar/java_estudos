package negativoPositivo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num_int;
		
		
		System.out.println("Digite um valor inteiro: ");
		num_int = sc.nextInt();
		
		if (num_int<0) {
			System.out.println(num_int + " é NEGATIVO.");
		} else {
			System.out.println(num_int + " é POSITIVO.");
		}

		
		sc.close();

	}

}
