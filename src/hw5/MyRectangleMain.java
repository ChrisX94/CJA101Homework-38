package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle myRectangle1 = new MyRectangle();
		myRectangle1.setWidth(10);
		myRectangle1.setDepth(20);
		myRectangle1.getArea();
		
		MyRectangle myRectangle2 = new MyRectangle(10, 20);
		myRectangle2.getArea();
		
	}

}
