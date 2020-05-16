package hw_3;

public class Circle {

	private double radius;
	private double diameter;
	
	public Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;	
	}
	public void areaCircle () {
		final double Pi = 3.1415926536;
		System.out.print("areaCircle = ");
		System.out.println(Pi * (diameter / 2) * (diameter / 2));
	}
	public void lengthCircle () {
		final double Pi = 3.1415926536;
		System.out.print("lengthCircle = ");
		System.out.println(2 * Pi * radius);
	}
	

}
