import java.util.*;
import java.io.*;

public class Part1{
  public static int winner (String you, String him){
    if (you.equals(him)){
      return 3;
    }
    if (you.equals("A") && him.equals ("B")){
      return 0;
    }
    if (you.equals("A") && him.equals ("C")){
      return 6;
    }
    if (you.equals("B") && him.equals ("A")){
      return 6;
    }
    if (you.equals("B") && him.equals ("C")){
      return 0;
    }
    if (you.equals("C") && him.equals ("A")){
      return 0;
    }
    return 6;
  }

  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    HashMap <String,Integer> key = new HashMap <>();
    key.put ("A", 1);
    key.put ("B", 2);
    key.put ("C", 3);
    ArrayList <String[]> bruh = new ArrayList <String[]> ();
    int score = 0;
    while (sc.hasNextLine()){
      String s = sc.nextLine();
      bruh.add (s.split(" "));
    }
    for (int i = 0; i < bruh.size(); i++){
      String y = (bruh.get(i))[0];
      String x = (bruh.get(i))[1];
      if (y.equals ("X")){
        y = "A";
      }
      if (y.equals ("Y")){
        y = "B";
      }
      if (y.equals ("Z")){
        y = "C";
      }
      score += key.get(y) + winner (y,x);
    }
    System.out.println(score);
  }
}
