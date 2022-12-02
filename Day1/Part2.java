import java.util.*;
import java.io.*;

public class Part2{

  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    ArrayList <Integer> arr = new ArrayList<>();
    int now = 0;
    while (sc.hasNextLine()){
      String line = sc.nextLine();
      if (line.length() == 0){
        arr.add(now);
        now = 0;
      }else{
        now += Integer.parseInt(line);
      }
      if (now > 0 && (!(sc.hasNextLine()))){
        arr.add(now);
      }
    }
    int [] arr2 = new int [arr.size()];
    for (int i = 0; i < arr.size(); i++){
        arr2[i] = arr.get(i);
    }
    int ans = 0;
    Arrays.sort(arr2);
    for (int i = 1; i < 4; i++){
        ans += arr2[arr2.length - i];
    }
    System.out.println (ans);
  }
}