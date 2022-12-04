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
            int [] rangefr = new int[4];
            rangefr[0] = Integer.parseInt(range[0][0]);
            rangefr[1] = Integer.parseInt(range[0][1]);
            rangefr[2] = Integer.parseInt(range[1][0]);
            rangefr[3] = Integer.parseInt(range[1][1]);
            int [] original = rangefr.clone();
            Arrays.sort (rangefr);
            boolean b = true;
                for (int i = 0; i < 4; i++){
                    b = b && (rangefr[i] == original[i]);
                }
            if (b && (!(rangefr[1] == rangefr[2]))){
                ans++;
            }else{
                if (rangefr[0] == original[2] && rangefr[1] == original[3]){
                    if ((!(rangefr[1] == rangefr[2])) && (!(original[1] == original[2]))){
                        ans++;
                    }
                }else{
                    if ((rangefr[0] == original[0] && rangefr[3] == original[1]) || (rangefr[0] == original[2] && rangefr[3] == original[3])){
                        ans++;
                    }
                    if ((rangefr[0] == original[0] && rangefr[2] == original[1]) && (original[1] == original[3])){
                        ans++;
                    }
                    if ((rangefr[0] == original[2] && rangefr[2] == original[3]) && (original[1] == original[3])){
                        ans++;
                    }
                    if ((rangefr[1] == original[0] && rangefr[3] == original[1]) && (original[0] == original[2])){
                        ans++;
                    }
                    if ((rangefr[1] == original[2] && rangefr[3] == original[3]) && (original[0] == original[2])){
                        ans++;
                    }
                }// SCRAP EVERYTHING THIS ELSE IF CHART SUCKS(IT DOESNT WORK)
            }
        }
        System.out.println (ans);
    }
}