package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length=0;
		width=0;
	}
	public Rectangle(double length1,double width1) {
		length=length1;
		width=width1;
	}
	public double area() {
		double A=0;
		A=length*width;
		return A;
	}
	public boolean compare(double target_area) {
		double input_A=area();
		boolean result=input_A<target_area;
		return result;
	}
	public boolean is_square() {

		boolean result;
		if (length==width)
			result=true;
		else
			result=false;
		return result;
	}
	public double perimeter() {
		double peri=0;
		peri=2*(length+width);
		return peri;
	}
	public void draw(double x, double y) {
		StdDraw.rectangle(x,y, width, length);
	}
	public static void main(String[] args) {
		Rectangle class1=new Rectangle(0.3,0.3);
		double A=class1.area();

		System.out.println(A);
		double P=class1.perimeter();
		System.out.println(P);
		class1.draw(0.5, 0.5);
		System.out.println(class1.compare(0.5));
		System.out.println(class1.is_square());
	}
}
