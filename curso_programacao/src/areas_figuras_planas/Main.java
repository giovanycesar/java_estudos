package areas_figuras_planas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, AreaTri, pi, AreaC, AreaTra, AreaQ, AreaR;
		
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
	
		AreaTri = A * C/2;
		
		pi = 3.14159; 
		AreaC = pi * (Math.pow(C, 2));
		
		AreaTra = (A+B)*C/2;
		
		AreaQ = B * B;
		
		AreaR = A * B;
	
		
		System.out.printf("TRIÂNGULO: %.3f%n", AreaTri);
		System.out.printf("CÍRCULO: %.3f%n", AreaC);
		System.out.printf("TRAPÉZIO: %.3f%n", AreaTra);
		System.out.printf("QUADRADO: %.3f%n", AreaQ);
		System.out.printf("RETÂNGULO: %.3f%n", AreaR);

		
		sc.close();

	}

}
