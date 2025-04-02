package hw8;


public class Train implements Comparable<Train>{

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start =start;
		this.dest = dest;
		try {
			setPrice(price);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Train() {}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price > 0) {
			this.price = price;
		} else {
			throw new Exception("Price can't be 0 or negative number");
		}
	}
	
	public void showInfo() {
		System.out.println("班次:" + number + ", 車種: " + type + ", 出發地: " + start + ", 目的地: "+ dest + ", 票價: "+  price);
	}
	
	@Override
	public int compareTo(Train train2) {
		if(this.number == train2.number) {
			return 0;
		}else if(this.number > train2.number){
			return 1;
		}else {
			return -1;
		}
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if(this.number == t.number && (this.type).equals(t.type) && (this.dest).equals(t.dest)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 23;
		int result = 1;
		result = result * prime + number;
		result = result*prime + (type == null ?0:type.hashCode());
		result = result*prime + (start  == null ?0:start.hashCode());
		result = result*prime + (dest  == null ?0:dest.hashCode());
		result = result*prime + (int)price;
		
		return result;
		
	}

}
