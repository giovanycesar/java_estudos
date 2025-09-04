package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> election = new LinkedHashMap<>();

		String path = "C:\\Users\\gvnce\\Downloads\\in.txt";

		System.out.println("File full path: " + path);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] voter = line.split(",");

				String name = voter[0];
				int vote = Integer.parseInt(voter[1]);

				if (!election.containsKey(name)) {

					election.put(name, vote);

				} else {

					int newVote = vote + election.get(name);

					election.put(name, newVote);

				}

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (String key : election.keySet()) {
			System.out.println(key + ": " + election.get(key));
		}

		sc.close();

	}

}
