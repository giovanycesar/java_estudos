package valor_a_pagar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco;
		
		System.out.println("Qual o código do produto? ");
		codigo = sc.nextInt();
		
		System.out.println("Qual a quantidade do produto? ");
		quantidade = sc.nextInt();
		
		
		switch(codigo) {
		case 1:
			preco = quantidade*4;
			System.out.printf("Produto: Cachorro Quente / Total: R$ %.2f%n", preco);
			break;
		case 2: 
			preco = quantidade*4.50;
			System.out.printf("Produto: X-Salada / Total: R$ %.2f%n", preco);
			break;
		case 3: 
			preco = quantidade*5;
			System.out.printf("Produto: X-Bacon / Total: R$ %.2f%n", preco);
			break;
		case 4: 
			preco = quantidade*2;
			System.out.printf("Produto: Torrada Simples / Total: R$ %.2f%n", preco);
			break;
		case 5: 
			preco = quantidade*1.50;
			System.out.printf("Produto: Refrigerante / Total: R$ %.2f%n", preco);
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		

		sc.close();
		}
	}