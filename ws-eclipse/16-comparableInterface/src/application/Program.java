package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		
		String path = "C:\\Users\\gvnce\\Downloads\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCSV = br.readLine();

			while (employeeCSV != null) {
				
				String[] fields = employeeCSV.split(",");
				
				String name = fields[0];
				double salary = Double.parseDouble(fields[1]);
				
				list.add(new Employee(name, salary));
				
				employeeCSV = br.readLine();
			}

			Collections.sort(list);

			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}