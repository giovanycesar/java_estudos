package entitiesContract;

import java.time.LocalDateTime;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDateTime date;
	private Double totalValue;

	private List<Installment> installments;

	public Contract() {

	}

	public Contract(Integer number, LocalDateTime date, Double totalValue, List<Installment> installments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}

}
