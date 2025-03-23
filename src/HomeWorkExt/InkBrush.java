package HomeWorkExt;

public class InkBrush extends Pen{
	
	public InkBrush(String brand, double price){
		super(brand, price);
	}
	
	public InkBrush(){
	}
	
	@Override
	public double getPrice() {
		double price = super.getPrice();
		return price * 0.9;
		
	}
	
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	

}
