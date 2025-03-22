package hw5;

/* 請設計一個類別MyRectangle：
 * (1) 有兩個double型態的屬性為width, depth
 * (2) 有三個方法：
 * (3) 有兩個建構子：
 * 請另外建立一個MyRectangleMain類別，此類別只有main方法
(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
*/
public class MyRectangle {

	private double width;
	private double depth;
	
	public MyRectangle() {
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		System.out.println(width * depth);
		return width * depth;
	}

}
