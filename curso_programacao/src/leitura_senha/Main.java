package leitura_senha;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		int senha, tentativa;
		
		tentativa = 0;
		senha = 2002;
		
		while (tentativa!=senha) {
			
			System.out.println("Digite sua senha: ");
			tentativa = sc.nextInt();
			
			if (tentativa==senha) {
				System.out.println("Acesso Permitido.");
			} else {
				System.out.println("Senha Invalida.");
			}
		}
		
	

		sc.close();
		}
	}
