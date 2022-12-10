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
	public void left (Cord2 head, int move){
		for (int i = 0; i < move; i++){
			save(head);
			head.setX (head.getX() - 1);
			boolean b = distance(head);
			if (!b){
				move();
			}
		}
	}

	public void right (Cord2 head, int move){
		for (int i = 0; i < move; i++){
			save(head);
			head.setX (head.getX() + 1);
			boolean b = distance(head);
			if (!b){
				move();
			}
		}
	}

	public void up (Cord2 head, int move){
		for (int i = 0; i < move; i++){
			save(head);
			head.setY (head.getY() + 1);
			boolean b = distance(head);
			if (!b){
				move();
			}
		}
	}

	public void down (Cord2 head, int move){
		for (int i = 0; i < move; i++){
			save(head);
			head.setY (head.getY() - 1);
			boolean b = distance(head);
			if (!b){
				move();
			}
		}
	}

	public void choose (Cord2 head, int move, char direction){
		if (direction == 'L'){
			left(head, move);
		}
		if (direction == 'R'){
			right(head, move);
		}
		if (direction == 'D'){
			down(head, move);
		}
		if (direction == 'U'){
			up(head, move);
		}
	}

	public void tailToTail (Cord2 head,Cord2 tail2,Cord2 tail3,Cord2 tail4,Cord2 tail5,Cord2 tail6,Cord2 tail7,Cord2 tail8,Cord2 tail9){
		for (int i = 0; i < move; i++){
			save(head);
			head.setY (head.getY() - 1);
			boolean b = distance(head);
			if (!b){
				move();
			}
		}
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

	public 

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
		while (sc.hasNextLine()){
			d.add (sc.next().charAt(0));
			m.add (sc.nextInt());
		}
		for (int k = 0; k < d.size(); k++){
			char direction = d.get(k);
			int move = m.get(k);
			ArrayList <Integer> bruh = new ArrayList<>();
			tail1.choose (head, move, direction);
			
		}
		System.out.println (nice.size());
		sc.close();
	}
}