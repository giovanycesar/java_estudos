package entitiesShape;

import entitiesShape.enums.Color;

public abstract class Shape {

	private Color cor;
	
	Shape(){
		
	}

	public Shape(Color cor) {
		super();
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
