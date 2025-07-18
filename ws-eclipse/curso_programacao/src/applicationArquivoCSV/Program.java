package applicationArquivoCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entitiesArquivoCSV.Item;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\gvnce\\OneDrive\\Área de Trabalho\\java_estudos\\15\\itens vendidos.csv";

		List<Item> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] old_item = line.split(",");

				String name = old_item[0];
				double price = Double.parseDouble(old_item[1]);
				int quantity = Integer.parseInt(old_item[2]);

				Item new_item = new Item(name, price, quantity);

				list.add(new_item);

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		String folderPath = "C:\\Users\\gvnce\\OneDrive\\Área de Trabalho\\java_estudos\\15";

		boolean success = new File(folderPath + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);

		String newFilePath = folderPath + "\\out\\summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))) {
			for (Item obj : list) {
				bw.write(obj.getName() + "," + String.format("%.2f", obj.total()));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
