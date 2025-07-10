package diferenca_do_produto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Qual o valor de A? ");
		A = sc.nextInt();
		
		System.out.println("Qual o valor de B? ");
		B = sc.nextInt();
		
		System.out.println("Qual o valor de C? ");
		C = sc.nextInt();
		
		System.out.println("Qual o valor de D? ");
		D = sc.nextInt();
		
		diferenca = (A*B)-(C*D);
		
		System.out.println("DIFERENÇA = " + diferenca);
		

		sc.close();
	}
}
