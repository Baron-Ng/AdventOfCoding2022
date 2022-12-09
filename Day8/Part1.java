import java.util.*;
import java.io.*;

public class Part1{
	public static ArrayList <ArrayList <Integer>> input (Scanner sc){
		ArrayList <ArrayList <Integer>> trees = new ArrayList<>();
		while (sc.hasNextLine()){
			ArrayList <Integer> broh = new ArrayList<>();
			String s = sc.nextLine();
			String [] bruh = s.split("");
			for (int i = 0; i < bruh.length; i++){
				broh.add (Integer.parseInt(bruh[i]));
			}
			trees.add (broh);
		}
		return trees;
	}

	public static ArrayList <ArrayList <Boolean>> arrayTrees (ArrayList <ArrayList <Integer>> trees){
		ArrayList <ArrayList <Boolean>> visible = new ArrayList <>();
		for (int i = 0; i < trees.size(); i++){
			ArrayList <Boolean> broh = new ArrayList<>();
			for (int j = 0; j < trees.get(i).size(); j++){
				int height = trees.get(i).get(j);
				boolean b = false;
				boolean temp = true;
				for (int k = j - 1; k >= 0; k--){ // moving left on x axis
					temp = temp && (height > trees.get(i).get(k));
				}
				b = b || temp;
				temp = true;
				for (int k = j + 1; k < trees.get(i).size(); k++){  // moving right on x axis
					temp = temp && (height > trees.get(i).get(k));
				}
				b = b || temp;
				temp = true;
				for (int k = i - 1; k >= 0; k--){  // moving up on y axis
					temp = temp && (height > trees.get(k).get(j));
				}
				b = b || temp;
				temp = true;
				for (int k = i + 1; k < trees.size(); k++){  // moving down on y axis
					temp = temp && (height > trees.get(k).get(j));
				}
				b = b || temp;
				broh.add (b);
			}
			visible.add (broh);
		}
		return visible;
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		ArrayList <ArrayList<Integer>> trees = input(sc);
		ArrayList <ArrayList<Boolean>> bools = arrayTrees (trees);
		for (int i = 0; i < bools.size(); i++){
			for (int j = 0; j < bools.get(i).size(); j++){
				if (bools.get(i).get(j)){
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}