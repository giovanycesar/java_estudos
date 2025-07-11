package imposto_de_renda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		double salario, sal_tax, imposto;
		
		System.out.println("Qual o salário do funcionário? ");
		salario = sc.nextDouble();
		
		if (salario<=2000.00) {
			System.out.println("Isento.");
		} else if (salario>2000.00 && salario<=3000.00) {
			sal_tax = salario-2000.00;
			imposto = sal_tax*8/100;
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		} else if (salario>3000.00 && salario<=4500.00) {
			sal_tax = salario-3000.00;
			imposto = (1000*8/100)+(sal_tax*18/100);
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		} else { 
			sal_tax = salario-4500.00;
			imposto = (1000*8/100)+(1500*18/100)+(sal_tax*28/100);
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		}
		
		
	

		sc.close();
		}
	}
