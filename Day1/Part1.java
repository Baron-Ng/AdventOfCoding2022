import java.util.*;
import java.io.*;

public class Part1{

  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int now = 0;
    int ans = 0;
    while (sc.hasNextLine()){
      String line = sc.nextLine();
      if (line.length() == 0){
        ans = Math.max (ans, now);
        now = 0;
      }else{
        now += Integer.parseInt(line);
      }
    }
    System.out.println(ans);
  }
}
