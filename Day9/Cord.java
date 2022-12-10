import java.util.*;

public class Cord{
	private int x;
	private int y;
	private int otherX;
	private int otherY;

	public Cord(){
		x = 0;
		y = 0;
	}
	public int getX (){
		return x;
	}

	public int getY (){
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

	public boolean distance (Cord other){ // true = within range ; false = out of range
		int oX = other.getX();
		int oY = other.getY();
		int distanceX = Math.abs (oX - x);
		int distanceY = Math.abs (oY - y);
		return (distanceX <= 1 && distanceY <= 1);
	}

	public void save (Cord other){
		otherX = other.getX();
		otherY = other.getY();
	}

	public void move (){
		x = otherX;
		y = otherY;
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
		Cord head = new Cord();
		Cord tail = new Cord();
		while (sc.hasNextLine()){
			char direction = sc.next().charAt(0);
			int move = sc.nextInt();
			if (direction == 'L'){
				for (int i = 0; i < move; i++){
					tail.save(head);
					head.setX (head.getX() - 1);
					boolean b = tail.distance(head);
					if (!b){
						tail.move();
					}
					ArrayList <Integer> bruh = new ArrayList<>();
					bruh.add (tail.getX());
					bruh.add (tail.getY());
					nice.add (bruh);
					//System.out.println (tail + "T");
					//System.out.println (head + "H");
				}
			}
			if (direction == 'R'){
				for (int i = 0; i < move; i++){
					tail.save(head);
					head.setX (head.getX() + 1);
					boolean b = tail.distance(head);
					if (!b){
						tail.move();
					}
					ArrayList <Integer> bruh = new ArrayList<>();
					bruh.add (tail.getX());
					bruh.add (tail.getY());
					nice.add (bruh);
					//System.out.println (tail + "T");
					//System.out.println (head + "H");
				}
			}
			if (direction == 'D'){
				for (int i = 0; i < move; i++){
					tail.save(head);
					head.setY (head.getY() - 1);
					boolean b = tail.distance(head);
					if (!b){
						tail.move();
					}
					ArrayList <Integer> bruh = new ArrayList<>();
					bruh.add (tail.getX());
					bruh.add (tail.getY());
					nice.add (bruh);
					//System.out.println (tail + "T");
					//System.out.println (head + "H");
				}
			}
			if (direction == 'U'){
				for (int i = 0; i < move; i++){
					tail.save(head);
					head.setY (head.getY() + 1);
					boolean b = tail.distance(head);
					if (!b){
						tail.move();
					}
					ArrayList <Integer> bruh = new ArrayList<>();
					bruh.add (tail.getX());
					bruh.add (tail.getY());
					nice.add (bruh);
					//System.out.println (tail + "T");
					//System.out.println (head + "H");
				}
			}
		}
		for (int i = 0; i < nice.size(); i++){
			boolean b = false;
			for (int j = i+1; j < nice.size(); j++){
				b = b || nice.get(i).equals(nice.get(j));
			}
			if (b){
				nice.remove(i);
				i--;
			}
		}
		System.out.println(nice.size());
		sc.close();
	}
}
