import java.util.*;
import java.io.*;

public class Part2{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <Character> chars = new ArrayList <>();
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++){
			chars.add (s.charAt(i));
		}
		for (int i = 0; i < chars.size() - 14; i++){
			boolean match = true;
			for (int j = i; j < i + 14; j++){
				char c = chars.get(j);
				for (int k = j+1; k < i + 14; k++){
					char x = chars.get(k);
					match = match && (x != c);
				}
			}
			if (match){
				System.out.println (i+14);
				break;
			}
		}
	}
}
