package metroQuadrado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area, preco;
		
		
		System.out.println("Digite a largura: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valor;
		
		System.out.printf("Área: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", preco);
		
		
		
		sc.close();

	}

}
