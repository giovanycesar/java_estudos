package uso_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		int num_int, soma;
		
		num_int = 1;
		soma = 0;
		
		
		while (num_int!=0) {
			System.out.println("Digite um número inteiro? ");
			num_int = sc.nextInt();
			
			soma += num_int;
		}
		
		System.out.println("Soma = " + soma);
		
		
		
	

		sc.close();
		}
	}
