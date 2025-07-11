package utilCurrencyConverter;

public class CurrencyConverter {

	public static double conversion(double dollar, double quantity) {
		return dollar * quantity + (dollar * quantity * 0.06);
	}

}
