import java.util.*;
import java.io.*;

public class Part2{
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

	public static ArrayList <ArrayList <Integer>> arrayTrees (ArrayList <ArrayList <Integer>> trees){
		ArrayList <ArrayList <Integer>> visible = new ArrayList <>();
		for (int i = 0; i < trees.size(); i++){
			ArrayList <Integer> broh = new ArrayList<>();
			for (int j = 0; j < trees.get(i).size(); j++){
				int height = trees.get(i).get(j);
                int up = 0;
                int down = 0;
                int left = 0;
                int right = 0;
				boolean temp = true;
				for (int k = j - 1; k >= 0; k--){ // moving left on x axis
                    left++;
					if (!(height > trees.get(i).get(k))){
                        break;
                    }
				}
				for (int k = j + 1; k < trees.get(i).size(); k++){  // moving right on x axis
                    right++;
					if (!(height > trees.get(i).get(k))){
                        break;
                    }
				}
				for (int k = i - 1; k >= 0; k--){  // moving up on y axis
                    up++;
					if (!(height > trees.get(k).get(j))){
                        break;
                    }
				}
				for (int k = i + 1; k < trees.size(); k++){  // moving down on y axis
                    down++;
					if (!(height > trees.get(k).get(j))){
                        break;
                    }
				}
                int value = up * down * left * right;
                broh.add (value);
			}
			visible.add (broh);
		}
		return visible;
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		ArrayList <ArrayList<Integer>> trees = input(sc);
		ArrayList <ArrayList<Integer>> values = arrayTrees (trees);
        int max = values.get(0).get(0);
		for (int i = 0; i < values.size(); i++){
			for (int j = 0; j < values.get(i).size(); j++){
				max = Math.max (max,values.get(i).get(j));
			}
		}
		System.out.println(max);
	}
}