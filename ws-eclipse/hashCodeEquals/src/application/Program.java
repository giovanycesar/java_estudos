package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");

		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Teste";
		String s2 = "Teste";

		String s3 = new String("Teste");
		String s4 = new String("Teste");

		System.out.println("Client hashCode c1: "+ c1.hashCode());
		System.out.println("Client hashCode c2: "+ c2.hashCode());
		
		System.out.println("Client equals (comparação de conteúdo): " + c1.equals(c2));
		
		System.out.println("Client == (comparação de referências): " + (c1 == c2));

		System.out.println("String == (comparação de conteúdo por literal): " + (s1 == s2));
		
		System.out.println("new String == (comparação de referências): " + (s3 == s4));
		
		System.out.println("String equals (comparação de conteúdo): " + s3.equals(s4));

	}

}
