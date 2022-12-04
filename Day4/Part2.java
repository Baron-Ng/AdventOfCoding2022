import java.util.*;
import java.io.*;

public class Part2{

    public static String toString (int[] arr){
        String s = "{";
        for (int i = 0; i < arr.length; i++){
            s += arr[i];
            if (i != arr.length -1){
                s += ", ";
            }
        }
        return s + "}";
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int ans = 0;
        while (sc.hasNextLine()){
            String [] bruh = sc.nextLine().split (",");
            String [][] range = new String [2][2];
            range[0] = bruh[0].split("-");
            range[1] = bruh[1].split("-");
            int a = Integer.parseInt(range[0][0]);
            int b = Integer.parseInt(range[0][1]);
            int c = Integer.parseInt(range[1][0]);
            int d = Integer.parseInt(range[1][1]);
            if (!(b < c || a > d)){
                ans++;
            } 
        }
        System.out.println (ans);
    }
}