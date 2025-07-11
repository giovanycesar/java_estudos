package uso_for;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		int num_int, quantidade, soma, contador;
		
		System.out.println("Quantos números você quer somar? ");
		quantidade = sc.nextInt();
		
		soma = 0;
		
		for (contador=0;contador<quantidade;contador++) {
			
			System.out.println("Digite um número inteiro? ");
			num_int = sc.nextInt();
			soma += num_int;
		}
		
		System.out.println("Soma = " + soma);
		
		sc.close();
		
		
		}
	}
