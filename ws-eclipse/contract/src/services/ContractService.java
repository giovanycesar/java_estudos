package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService() {

	}

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {

		double valuePerInstallment = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {

			double interest = paymentService.interest(valuePerInstallment, i);

			double amount = interest + valuePerInstallment;

			double paymentFee = paymentService.paymentFee(amount);

			amount += paymentFee;

			LocalDate duoDate = contract.getDate().plusMonths(i);

			contract.getInstallments().add(new Installment(duoDate, amount));

		}

	}
}
