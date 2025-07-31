package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");

		System.out.print("Numero: ");
		int number = sc.nextInt();

		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();

		Contract contract = new Contract(number, date, totalValue);

		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, months);
		
		System.out.println("Parcelas: ");
		
		List<Installment> installments = contract.getInstallments();
		
		for (Installment inst : installments) {
			System.out.println(fmt.format(inst.getDuoDate()) + " - " + String.format("%.2f", inst.getAmount()));
		}

		sc.close();

	}

}
