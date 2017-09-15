package chapter9;

class Rectangle{
	double width;
	double height;
	Rectangle(){
		width=1;
		height=1;
	}
	Rectangle(double w,double h){
		width=w;
		height=h;
	}
	double getArea(){
		return Math.round(width*height*100)/100.0;
	}
	double getPerimeter(){
		return 2*(width+height);
	}
}
public class Question1 {
public static void main(String args[]){
	Rectangle r1=new Rectangle(4,40);
	Rectangle r2=new Rectangle(3.5,35.9);
	System.out.println("The rectangle with width "+r1.width+" and height "+r1.height+" has perimeter "
			+ r1.getPerimeter()+" and area "+r1.getArea());
	System.out.println("The rectangle with width "+r2.width+" and height "+r2.height+" has perimeter "
			+ r2.getPerimeter()+" and area "+r2.getArea());
}
}