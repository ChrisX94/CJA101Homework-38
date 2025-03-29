package hw6;

public class Calculator {

	private int x;
	private int y;

	public Calculator() throws Exception {

	}

	public void setX(int x) {
		this.x = x;

	}

	public int getX() {
		return x;
	}

	// 這裡設定y是負數的話拋出CalException("次方為負值不為整數")
	public void setY(int y) throws CalException {
		if (y >= 0)
			this.y = y;
		else
			throw new CalException("次方為負值，結果回傳不為整數!!");
	}

	public int getY() {
		return y;
	}

	// 這裡設定x,y都是是的話拋出CalException("0 的 0 次方沒有意義")
	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0 的 0 次方沒有意義");
		} else {
			System.out.println(x + "的" + y + "次方等於" + (int) Math.pow(x, y));
			return (int) Math.pow(x, y);
		}
	}

}
