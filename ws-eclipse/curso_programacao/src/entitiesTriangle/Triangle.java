package entitiesTriangle;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p, result;
		
		p = (a + b + c) / 2;
		result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return result;

	}

}
