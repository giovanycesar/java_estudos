package salario_hora_funcionario;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		double horas, valorHora, salario;
		
		System.out.println("Qual o número do funcionário? ");
		funcionario = sc.nextInt();
		
		System.out.println("Quantas horas esse funcionário trabalhou? ");
		horas = sc.nextDouble();
		
		System.out.println("Qual o valor pago por hora? ");
		valorHora = sc.nextDouble();
		
		salario = horas*valorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		

		sc.close();
	}
}
