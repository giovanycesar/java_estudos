package exemploForEach;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
			
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		for (String obj:vect) {
			System.out.println(obj);
		}

	
	}

}
