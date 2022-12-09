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

	public boolean distance (Point other){
		int otherX = other.getX();
		int otherY = other.getY();
		int distance = Math.sqrt (Math.pow((x - otherX),2) + Math.pow((Y - otherY),2));
		return distance <= 1;
	}

	public void direction (Point other){
		// determine in which direction to move
	}
}
