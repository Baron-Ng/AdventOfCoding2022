import java.util.*;
import java.io.*;

public class Part1{
  public static void bubblesort(ArrayList<Integer> arr){
    int temp;
    int leaf = 1;
    while (leaf != 0){
      leaf = 0;
      for (int i = 1; i < arr.size(); i++){
        if (arr.get(i-1) > arr.get(i)){
          temp = arr.get(i);
          arr.set(i, arr.get(i-1));
          arr.set(i-1, temp);
          leaf = 1;
        }
      }
    }
  }

  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    ArrayList <Integer> sums = new ArrayList <Integer> ();
    while (sc.hasNextLine()){
      ArrayList <Integer> sum = new ArrayList <Integer> ();
      int total = 0;
      while (try {(!(sc.nextLine().equals("")))} catch (NoSuchElementException e){true}){
        sum.add (sc.nextInt());
      }
      for (int i = 0; i < sum.size(); i++){
        total += sum.get(i);
      }
      sums.add(total);
    }
    bubblesort (sums);
    int x = sums.get(sums.size()-1);
    System.out.println (x);
  }
}
