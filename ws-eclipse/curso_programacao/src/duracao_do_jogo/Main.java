package duracao_do_jogo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int hora_inicial, hora_final, duracao;

		System.out.println("Digite a hora inicial do jogo: ");
		hora_inicial = sc.nextInt();

		System.out.println("Digite a hora final do jogo: ");
		hora_final = sc.nextInt();
		
		if (hora_inicial>=hora_final) {
			duracao = (24 - hora_inicial) + hora_final;
			System.out.println("O jogo durou " + duracao + " hora(s).");
		} else {
			duracao = hora_final-hora_inicial;
			System.out.println("O jogo durou " + duracao + " hora(s).");
		}

		sc.close();

	}

}