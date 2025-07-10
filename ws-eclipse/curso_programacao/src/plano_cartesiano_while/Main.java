package plano_cartesiano_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x, y;

		x = 1;
		y = 1;

		while (x != 0 && y != 0) {
			
			System.out.println("Qual o valor de x? ");
			x = sc.nextDouble();

			System.out.println("Qual o valor de y? ");
			y = sc.nextDouble();

			if (x > 0 && y > 0) {
				System.out.println("Primeiro.");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo.");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro.");
			} else if (x>0 && y<0) {
				System.out.println("Quarto.");
			}

		}

		sc.close();
	}
}
