package HomeWorkExt;

public class Pencil extends Pen{
	
	public Pencil(String brand, double price){
		super(brand, price);
	}
	
	public Pencil(){
	}
	
	@Override
	public double getPrice(){
		double price = super.getPrice();
		return price * 0.8;
	}
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
		
}
