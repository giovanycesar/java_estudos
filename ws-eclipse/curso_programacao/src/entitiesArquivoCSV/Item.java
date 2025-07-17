package entitiesArquivoCSV;

public class Item {

	public String name;
	public Double total_price;
	
	Item(){
		
	}

	public Item(String name, Double total_price) {
		this.name = name;
		this.total_price = total_price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	
	
}
