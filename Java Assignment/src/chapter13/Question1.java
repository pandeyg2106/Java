package chapter13;

import java.util.Scanner;

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, the get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}
class Triangle extends GeometricObject{
	private double side1,side2,side3;
	Triangle(String color,boolean filled,double s1,double s2,double s3){
		super(color,filled);
		side1=s1;
		side2=s2;
		side3=s3;}
	@Override
	public double getArea(){
		if(((side1+side2)>side3)&&((side3+side2)>side1) &&((side1+side3)>side2)&&	(Math.abs(side1-side2)<=side3)&&(Math.abs(side2-side3)<=side1) &&(Math.abs(side1-side3)<=side2))
		{double s=(side1+side2+side3)/2;
		double res=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return ((int)Math.round(res*100)/100.0);	}
		else{
			System.out.println("Wrong sides entered");
			return 0.0;					
		}	
	}
	@Override
	public double getPerimeter(){
		double res=(side1+side2+side3);		
	return res;	
	}
	@Override
	public String toString() {
	return "Area of the triangle is "+ getArea()+" and the perimeter is "+getPerimeter()+"\n"+super.toString();
	}
}
public class Question1 {
	public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. :");
	double side1=input.nextDouble();
	double side2=input.nextDouble();
	double side3=input.nextDouble();
	String color=input.next();
	boolean filled=input.nextBoolean();
	Triangle t=new Triangle(color,filled,side1,side2,side3);
	System.out.println(t);
	}

}