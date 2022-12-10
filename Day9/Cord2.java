import java.util.*;

public class Cord2{
	private int x;
	private int y;
	private int otherX;
	private int otherY;

	public Cord2(){
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

	public boolean distance (Cord2 other){ // true = within range ; false = out of range
		int oX = other.getX();
		int oY = other.getY();
		int distanceX = Math.abs (oX - x);
		int distanceY = Math.abs (oY - y);
		return (distanceX <= 1 && distanceY <= 1);
	}

	public void save (Cord2 other){
		otherX = other.getX();
		otherY = other.getY();
	}

	public void move (){
		x = otherX;
		y = otherY;
	}
	public static ArrayList <ArrayList <Integer>> left (Cord2 tail, Cord2 head, int move){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
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
		return nice;
	}

	public static ArrayList <ArrayList <Integer>> right (Cord2 tail, Cord2 head, int move){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
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
		return nice;
	}

	public static ArrayList <ArrayList <Integer>> up (Cord2 tail, Cord2 head, int move){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
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
		return nice;
	}

	public static ArrayList <ArrayList <Integer>> down (Cord2 tail, Cord2 head, int move){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
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
		return nice;
	}

	public static ArrayList <ArrayList <Integer>> choose (Cord2 tail, Cord2 head, int move, char direction){
		if (direction == 'L'){
			return left(tail, head, move);
		}
		if (direction == 'R'){
			return right(tail, head, move);
		}
		if (direction == 'D'){
			return down(tail, head, move);
		}
		return up(tail, head, move);
	}

	public static ArrayList <ArrayList <Integer>> removeDupes (ArrayList <ArrayList <Integer>> nice){
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
		return nice;
	}

	public static ArrayList <ArrayList <Integer>> merge (ArrayList <ArrayList <Integer>> a, ArrayList <ArrayList <Integer>> b){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
		for (int i = 0; i < a.size(); i++){
			nice.add (a.get(i));
		}
		for (int i = 0; i < b.size(); i++){
			nice.add (b.get(i));
		}
		return nice;
	}

	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
		ArrayList <Character> d = new ArrayList<>();
		ArrayList <Integer> m = new ArrayList<>();
		Cord2 head = new Cord2();
		Cord2 tail1 = new Cord2();
		Cord2 tail2 = new Cord2();
		Cord2 tail3 = new Cord2();
		Cord2 tail4 = new Cord2();
		Cord2 tail5 = new Cord2();
		Cord2 tail6 = new Cord2();
		Cord2 tail7 = new Cord2();
		Cord2 tail8 = new Cord2();
		Cord2 tail9 = new Cord2();
		ArrayList <ArrayList <Integer>> sub1 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub2 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub3 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub4 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub5 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub6 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub7 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub8 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> sub9 = new ArrayList<>();
		while (sc.hasNextLine()){
			d.add (sc.next().charAt(0));
			m.add (sc.nextInt());
		}
		for (int k = 0; k < d.size(); k++){
			char direction = d.get(k);
			int move = m.get(k);
			sub1 = choose (tail1, head, move, direction);
		}
	}
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
		return (nice.size());
		sc.close();
	}
}