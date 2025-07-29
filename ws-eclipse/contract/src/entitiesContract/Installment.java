package entitiesContract;

import java.time.LocalDateTime;

public class Installment {

	private LocalDateTime duoDate;
	private Double amount;

	public Installment() {

	}

	public Installment(LocalDateTime duoDate, Double amount) {
		this.duoDate = duoDate;
		this.amount = amount;
	}

	public LocalDateTime getDuoDate() {
		return duoDate;
	}

	public void setDuoDate(LocalDateTime duoDate) {
		this.duoDate = duoDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
