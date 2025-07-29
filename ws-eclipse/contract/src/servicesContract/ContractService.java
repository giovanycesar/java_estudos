package servicesContract;

import java.time.LocalDateTime;

import entitiesContract.Contract;
import entitiesContract.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	ContractService() {

	}

	public void processContract(Contract contract, int months) {

		double valuePerInstallment = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {

			double interest = paymentService.interest(valuePerInstallment, i);

			double amount = interest + valuePerInstallment;

			double paymentFee = paymentService.paymentFee(amount);

			amount += paymentFee;

			LocalDateTime installmentDate = contract.getDate().plusMonths(i);

			contract.getInstallments().add(new Installment(installmentDate, amount));

		}

	}
}
