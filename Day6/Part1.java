import java.util.*;
import java.io.*;

public class Part1{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <Character> chars = new ArrayList <>();
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++){
			chars.add (s.charAt(i));
		}
		for (int i = 0; i < chars.size() - 4; i++){
			char one = chars.get(i);
			char two = chars.get(i+1);
			char three = chars.get(i+2);
			char four = chars.get(i+3);
			boolean oneMatch = one != two && one != three && one != four;
			boolean twoMatch = two != three && two != four;
			boolean threeMatch = three != four;
			if (oneMatch && twoMatch && threeMatch){
				System.out.println (i+3 + 1);
				break;
			}
		}
	}
}
