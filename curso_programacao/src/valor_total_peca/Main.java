package valor_total_peca;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, quantidade1, quantidade2;
		double valorUnitario1, valorUnitario2, pagamento;
		
		System.out.println("1: Qual o código da peça? ");
		codigo1 = sc.nextInt();
		
		System.out.println("1: Qual o número de peças? ");
		quantidade1 = sc.nextInt();
		
		System.out.println("1: Qual o valor unitário de cada peça? ");
		valorUnitario1 = sc.nextDouble();
		
		System.out.println("2: Qual o código da primeira peça? ");
		codigo2 = sc.nextInt();
		
		System.out.println("2: Qual o número de peças? ");
		quantidade2 = sc.nextInt();
		
		System.out.println("2: Qual o valor unitário de cada peça? ");
		valorUnitario2 = sc.nextDouble();
		
		pagamento = (quantidade1*valorUnitario1)+(quantidade2*valorUnitario2);
		
		System.out.println("Códigos dos produtos: " + codigo1 + ", " + codigo2);
		System.out.printf("Valor a pagar: R$ %.2f%n", pagamento);
		

		sc.close();
		}
	}
