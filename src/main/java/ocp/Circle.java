package ocp;

public class Circle {
	private double radius;
	
	public double calculateArea() {
		double pi= Math.PI;
		return pi*this.getRadius() * this.getRadius();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
}
