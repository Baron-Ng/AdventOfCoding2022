import java.util.*;
import java.io.*;

public class Part1{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <String> inputs = new ArrayList<>();
		ArrayList <ArrayList<Integer>> nums = new ArrayList<>();
		ArrayList <Integer> sums = new ArrayList<>();
		while (sc.hasNext()){
			ArrayList <Integer> bruh = new ArrayList<>();
			if (sc.hasNextInt()){
			while (sc.hasNextInt()){
				bruh.add (sc.nextInt());
			}}else{
				String x = sc.next();
				if (x.equals("cd")){
					String s = sc.next();
					if (s.equals("/")){
						inputs.add ("cd /");
					}else{
					}if (s.equals("..")){
						inputs.add ("cd ..");
					}else{
						inputs.add ("cd");
					}
				}else{
				if (x.equals("ls")){
					inputs.add ("ls");
				}
				}
			}
			if (bruh.size() != 0){
				nums.add (bruh);
			}
		}
		System.out.println (inputs);
		System.out.println (nums);
	} // both the input and nums array conditionals need a lot of fixing
}
