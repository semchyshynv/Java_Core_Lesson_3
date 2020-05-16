package hw_3;
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle () {
		this.length = 11;
		this.width = 14;
	}
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	
	public void areaRectangle () {
		System.out.print(" areaRectangle= ");
		System.out.println(length * width);
		
	}
	
	public void perimeterRectangle () {
		System.out.print("perimeterRectangle = ");
		System.out.println((length + width) * 2);
	}

}

