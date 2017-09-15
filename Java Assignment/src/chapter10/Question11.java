package chapter10;

class Circle2D {
	private double x, y; // center of circle
	private double radius;
	Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getRadius() {
		return radius;
	}

	double getArea() {
		return Math.round(Math.PI * radius * radius * 100) / 100.0;
	}

	double getPerimeter() {
		return Math.round(Math.PI * radius * 2 * 100) / 100.0;
	}
	
	boolean contains(double x, double y) {
		return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)) < radius);
	}

	boolean contains(Circle2D circle) {
		double r = Math.sqrt((this.x - circle.getX()) * (this.x - circle.getX())
				+ (this.y - circle.getY()) * (this.y - circle.getY()));
		return ((radius - circle.getRadius()) >= r && radius > circle.getRadius());
	}

	boolean overlaps(Circle2D circle) {
		double r = Math.sqrt((this.x - circle.getX()) * (this.x - circle.getX())
				+ (this.y - circle.getY()) * (this.y - circle.getY()));
		return (Math.abs(radius - circle.getRadius()) <= r && r <= (radius + circle.getRadius()));
	}
}
public class Question11 {
	public static void main(String[] args) throws java.lang.Exception {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area of the circle with radius " + c1.getRadius() + " is " + c1.getArea()
				+ " and perimeter is " + c1.getPerimeter());
		if (c1.contains(3, 3))
			System.out.println("This point is inside the circle");
		else
			System.out.println("This point is not inside the circle");
		if (c1.contains(new Circle2D(4, 5, 10.5)))
			System.out.println("This circle is inside the circle with " + c1.getRadius());
		else
			System.out.println("This circle is not inside the circle with " + c1.getRadius());
		if (c1.overlaps(new Circle2D(3, 5, 2.3)))
			System.out.println("This circle overlaps the circle with " + c1.getRadius());
		else
			System.out.println("This circle does not overlap the circle with " + c1.getRadius());
	}
}
