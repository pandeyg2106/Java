package chapter13;

interface Colorable {
	public abstract void howToColor();
}

class Square extends GeometricObject implements Colorable {
	private double side;

	Square(String color, boolean filled, double s) {
		super(color, filled);
		side = s;
	}

	@Override
	public double getArea() {
		return (side * side);
	}

	@Override
	public double getPerimeter() {
		return (4 * side);
	}

	@Override
	public void howToColor() {
		System.out.println(" Color all four sides");
	}

	@Override
	public String toString() {
		return "Area of the square is " + getArea() + " and the perimeter is " + getPerimeter() + "\n"
				+ super.toString();
	}
}

public class Question7 {
	public static void main(String args[]) {
		GeometricObject gm[] = new GeometricObject[5];
		gm[0] = new Square("red", true, 3);
		gm[1] = new Square("white", false, 4);
		gm[2] = new Square("blue", true, 2);
		gm[3] = new Square("yellow", true, 5);
		gm[4] = new Square("green", false, 3);
		for (int i = 0; i < 5; i++) {
			System.out.println("The area of Sqaure no. " + (i+1) + " is " + gm[i].getArea());
			if (gm[i].isFilled()) {
				System.out.println("This square is colorable, so to color this square with " + gm[i].getColor() + ". Do the follwoing:");
				((Square) gm[i]).howToColor();
			}
		}
	}

}
