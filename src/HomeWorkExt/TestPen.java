package HomeWorkExt;

public class TestPen {

	public static void main(String[] args) {
		Pen[] pen = new Pen[2];
		pen[0] = new Pencil("Pencil", 100);
		pen[1] = new InkBrush("InkBrush", 100);
		
		System.out.println(pen[0].getPrice());
		pen[0].write();
		
		System.out.println(pen[1].getPrice());
		pen[1].write();
		
	}

}
