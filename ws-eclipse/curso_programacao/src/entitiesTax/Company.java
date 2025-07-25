package entitiesTax;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		if (numberOfEmployees<=10) {
			return (super.getAnualIncome() * 0.16);
		} else {
			return (super.getAnualIncome() * 0.14);
		}
	}
}
