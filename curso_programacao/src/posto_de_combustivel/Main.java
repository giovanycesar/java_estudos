package posto_de_combustivel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo, alcool, gasolina, diesel;

		codigo = 1;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		while (codigo != 4) {

			System.out.println("Qual o combustível? 1. Álcool / 2. Gasolina / 3. Diesel / 4. Fim");
			codigo = sc.nextInt();

			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3) {
				diesel += 1;
			}
		}

		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
