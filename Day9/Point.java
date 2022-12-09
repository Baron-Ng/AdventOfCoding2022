public class Point{
	private x;
	private y;

	public class Point (){
		x = 0;
		y = 0;
	}

	public int getX (){
		return x;
	}

	public int getX (){
		return y;
	}

	public int setX (int input){
		int temp = x;
		this.x = input;
		return temp;
	}

	public int setY (int input){
		int temp = y;
		this.y = input;
		return temp;
	}

	public String toString (){
		return "(" + x + ", " + y + ")";
	}
}
