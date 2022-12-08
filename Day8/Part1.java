import java.util.*;
import java.io.*;

public class Part1{
	public static ArrayList <ArrayList <Integer>> input (Scanner sc){
		ArrayList <Integer> trees = new ArrayList<>();
		while (sc.hasNextLine()){
			ArrayList <Integer> broh = new ArrayList<>();
			String s = sc.nextLine();
			String [] bruh = s.split("");
			for (int i = 0; i < bruh.length(); i++){
				broh.add (Integer.parseInt(bruh[i]));
			}
			trees.add (broh);
		}
		return trees;
	}

	public static ArrayList <ArrayList <Boolean>> arrayTrees (ArrayList <ArrayList <Integer>> trees){
		ArrayList <ArrayList <Boolean>> visible = new ArrayList <>();
		for (int i = 0; i < trees.size(); i++){
			ArrayList <Integer> broh = new ArrayList<>();
			for (int j = 0; j < trees.get(i).size()){
				int height = trees.get(i).get(j);
				boolean b = true;
				for (int k = j - 1; k > 0; k--){ // moving left on x axis
					b = b && (height > trees.get(i).get(k));
				}
				for (int k = j + 1; k < trees.get(i).size(); k++){  // moving right on x axis
					b = b && (height > trees.get(i).get(k));
				}
				for (int k = i - 1; k > 0; k--){  // moving up on y axis
					b = b && (height > trees.get(k).get(j));
				}
				for (int k = i + 1; k < trees.size(); k++){  // moving down on y axis
					b = b && (height > trees.get(k).get(j));
				}
				broh.add (b);
			}
			visible.add (broh);
		}
		return visible;
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		ArrayList <ArrayList<Integer>> trees = input(sc);
		ArrayList <ArrayList<Boolean>> bools = arrayTrees (trees);
		
	}
}
