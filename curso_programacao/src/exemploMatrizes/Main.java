package exemploMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];
		List<Integer> diagonal = new ArrayList<>();
		int negativos = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();

				if (i == j) {
					diagonal.add(mat[i][j]);
				}
				
				if (mat[i][j]<0) {
					negativos += 1;
				}
				
			}
		}

		System.out.println("Main diagonal: ");
		
		for (Integer obj : diagonal) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
		
		System.out.println("Negative numbers = " + negativos);
		
		sc.close();

	}

}
