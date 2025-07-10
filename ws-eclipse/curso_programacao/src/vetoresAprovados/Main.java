package vetoresAprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] pri_sem = new double[n];
		double[] seg_sem = new double[n];
		String[] aprovados = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");

			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();

			System.out.print("Nota do 1º semestre: ");
			pri_sem[i] = sc.nextDouble();

			System.out.print("Nota do 2º semestre: ");
			seg_sem[i] = sc.nextDouble();

			if ((pri_sem[i] + seg_sem[i])/2 >= 6.0) {
				aprovados[i] = nomes[i];
			}

		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < n; i++) {
			if (aprovados[i]!=null) {
				System.out.println(aprovados[i]);
			}
		}

		sc.close();

	}
}
