import java.util.*;
import java.io.*;

public class Part1{
	public static ArrayList<String> inputToStringList(Scanner sc){
		ArrayList <String> bruh = new ArrayList<>();
		while (sc.hasNext()){
			bruh.add (sc.next());
		}
		return bruh;
	}

	public static int sum (ArrayList<Integer> bruh){
		int sum = 0;
		for (int i = 0; i < bruh.size(); i++){
			sum += bruh.get(i);
		}
		return sum;
	}

	public static 
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <String> input = inputToStringList(sc);
		int cd = 0; // number represents what level it is at, 0 being "/"
		System.out.println (input);
		ArrayList <ArrayList<Integer>> storage = new ArrayList<>();
		ArrayList <Integer> dirs = new ArrayList<>();
		for (int i = 0; i < input.size(); i++){
			if (input.get(i).equals("cd")){
				if (input.get(i+1).equals("..")){
					cd--;
				}
				if (input.get(i+1).equals("/")){
					cd = 0;
				}else{
					cd++;

				}
			}else{
			if (input.get(i).equals("ls")){
				ArrayList <Integer> bruh = new ArrayList<>();
				for (int j = 1; j < input.size(); j++){
					if (!(input.get(i).equals("$"))){
						double amount = Integer.parseInt(input.get(i + j));
						int actual = (int) Math.round(Math.pow (amount, Math.pow(2, cd)));
						bruh.add (actual);
					}else{
						break;
					}
				}
				storage.add (bruh);
			}
			}
		}
	}
}
