import java.util.*;
import java.io.*;

public class Part2{
  public static int winner (String you, String him){
    HashMap <String,Integer> key = new HashMap <>();
    key.put ("A", 1);
    key.put ("B", 2);
    key.put ("C", 3);
    if (you.equals("B")){
      return 3 + key.get(him);
    }
    if (you.equals("A") && him.equals ("A")){ // opponent rock, you lose
      return 3;
    }
    if (you.equals("A") && him.equals ("B")){ // opponent paper, you lose
        return 1;
      }
    if (you.equals("A") && him.equals ("C")){ // opponent scissors, you lose
      return 2;
    }
    if (you.equals("C") && him.equals ("A")){ // opponent rock, you win
      return 2 + 6;
    }
    if (you.equals("C") && him.equals ("B")){ // opponent paper, you win
        return 3 + 6;
      }
    return 1 + 6; // opponent scissors, you win
  }

  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    ArrayList <String[]> bruh = new ArrayList <String[]> ();
    int score = 0;
    while (sc.hasNextLine()){
      String s = sc.nextLine();
      bruh.add (s.split(" "));
    }
    for (int i = 0; i < bruh.size(); i++){
      String x = (bruh.get(i))[0];
      String y = (bruh.get(i))[1];
      if (y.equals ("X")){
        y = "A";
      }
      if (y.equals ("Y")){
        y = "B";
      }
      if (y.equals ("Z")){
        y = "C";
      }
      score += winner (y,x);
    }
    System.out.println(score);
  }
}
