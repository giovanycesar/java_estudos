package uso_funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, higher;
		
		System.out.println("Enter three numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
		
	}

}
