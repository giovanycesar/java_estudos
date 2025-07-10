package entitiesShape;

import entitiesShape.enums.Color;

public class Circle extends Shape {

	private Double radius;

	Circle() {
		super();
	}

	public Circle(Color cor, Double radius) {
		super(cor);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
