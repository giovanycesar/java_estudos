package media_ponderada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidade, contador;
		double valor_dec1, valor_dec2, valor_dec3, media;

		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();

		for (contador = 0; contador < quantidade; contador++) {

			System.out.println("Digite o primeiro valor: ");
			valor_dec1 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			valor_dec2 = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor: ");
			valor_dec3 = sc.nextDouble();
			
			media = ((valor_dec1*2)+(valor_dec2*3)+(valor_dec3*5))/(2+3+5);
			
			System.out.printf("Média ponderada: %.1f%n", media);
			
		}

		sc.close();

	}

}
