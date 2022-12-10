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

	public void direction (char direction){
		if (direction == 'L'){
			setX (getX() - 1);
		}
		if (direction == 'R'){
			setX (getX() + 1);
		}
		if (direction == 'D'){
			setY (getY() - 1);
		}
		if (direction == 'U'){
			setY (getY() + 1);
		}
	}

	public void tailFollow (Cord2 head){
		int headX = head.getX();
		int headY = head.getY();
		int diffX = headX - x;
		int diffY = headY - y;
		if (diffX == -2 && diffY == -1){ // left 3 // bottom
			setX (getX() - 1);
			setY (getY() - 1);
		}
		if (diffX == -2 && diffY == 0){ // middle
			setX (getX() - 1);
		}
		if (diffX == -2 && diffY == 1){ // top
			setX (getX() - 1);
			setY (getY() + 1);
		}
		if (diffX == 2 && diffY == -1){ // right 3, bottom
			setX (getX() + 1);
			setY (getY() - 1);
		}
		if (diffX == 2 && diffY == 0){// middle
			setX (getX() + 1);
		}
		if (diffX == 2 && diffY == 1){ // top
			setX (getX() + 1);
			setY (getY() + 1);
		}
		if (diffX == -1 && diffY == 2){ // top 3, left
			setX (getX() - 1);
			setY (getY() + 1);
		}
		if (diffX == 0 && diffY == 2){// middle
			setY (getY() + 1);
		}
		if (diffX == 1 && diffY == 2){ // right
			setX (getX() + 1);
			setY (getY() + 1);
		}
		if (diffX == -1 && diffY == -2){ // bottom 3 // left
			setX (getX() - 1);
			setY (getY() - 1);
		}
		if (diffX == 0 && diffY == -2){ // middle
			setY (getY() - 1);
		}
		if (diffX == 1 && diffY == -2){ // right
			setX (getX() + 1);
			setY (getY() - 1);
		}
		if (diffX == -2 && diffY == 2){ //diagonals  // top left
			setX (getX() - 1);
			setY (getY() + 1);
		}
		if (diffX == 2 && diffY == 2){ // top right
			setX (getX() + 1);
			setY (getY() + 1);
		}
		if (diffX == 2 && diffY == -2){ // bottom right
			setX (getX() + 1);
			setY (getY() - 1);
		}
		if (diffX == -2 && diffY == -2){ // bottom left
			setX (getX() - 1);
			setY (getY() - 1);
		}
	}

	public static ArrayList <ArrayList <Integer>> headToTail (int move, char direction, Cord2 head, Cord2 tail1, Cord2 tail2,Cord2 tail3,Cord2 tail4,Cord2 tail5,Cord2 tail6,Cord2 tail7,Cord2 tail8,Cord2 tail9){
		ArrayList <ArrayList <Integer>> nice = new ArrayList<>();
		for (int i = 0; i < move; i++){
			ArrayList <Integer> bruh = new ArrayList<>();
			tail1.save(head);
			tail2.save(tail1);
			tail3.save(tail2);
			tail4.save(tail3);
			tail5.save(tail4);
			tail6.save(tail5);
			tail7.save(tail6);
			tail8.save(tail7);
			tail9.save(tail8);
			head.direction(direction);
			boolean b = tail1.distance(head);
			if (!b){
				tail1.tailFollow(head);
				b = tail2.distance(tail1);
				if (!b){
					tail2.tailFollow(tail1);
					b = tail3.distance(tail2);
					if (!b){
						tail3.tailFollow(tail2);
						b = tail4.distance(tail3);
						if (!b){
							tail4.tailFollow(tail3);
							b = tail5.distance(tail4);
							if (!b){
								tail5.tailFollow(tail4);
								b = tail6.distance(tail5);
								if (!b){
									tail6.tailFollow(tail5);
									b = tail7.distance(tail6);
									if (!b){
										tail7.tailFollow(tail6);
										b = tail8.distance(tail7);
										if (!b){
											tail8.tailFollow(tail7);
											b = tail9.distance(tail8);
											if (!b){
												tail9.tailFollow(tail8);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			bruh.add (tail9.getX());
			bruh.add (tail9.getY());
			nice.add (bruh);
		}
		return nice;
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
	
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <ArrayList <ArrayList<Integer>>> nice = new ArrayList<>();
		ArrayList <ArrayList<Integer>> cords = new ArrayList<>();
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
			ArrayList <ArrayList<Integer>> bruh = new ArrayList<>();
			bruh = headToTail(move, direction, head, tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9);
			nice.add (bruh);
		}
		for (int i = 0; i < nice.size(); i++){
			for (int j = 0; j < nice.get(i).size(); j++){
				cords.add (nice.get(i).get(j));
			}
		}
		cords = removeDupes(cords);
		System.out.println (cords.size());
		sc.close();
	}
}