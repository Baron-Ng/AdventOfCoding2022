import java.util.*;
import java.io.*;

public class Part1{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int ans = 0;
        while (sc.hasNextLine()){
            String [] bruh = sc.nextLine().split (",");
            String [][] range = new String [2][2];
            range[0] = bruh[0].split("-");
            range[1] = bruh[1].split("-"); // everything here works
            boolean first1LessThanSecond1 = Integer.parseInt(range[0][0]) < Integer.parseInt(range[1][0]);
            boolean first2GreaterThanSecond2 = Integer.parseInt(range[0][1]) > Integer.parseInt(range[1][1]);
            boolean firstequals = Integer.parseInt(range[0][0]) == Integer.parseInt(range[1][0]);
            boolean secondequals = Integer.parseInt(range[0][1]) == Integer.parseInt(range[1][1]);
            if (first1LessThanSecond1){ // assume first 1 less than sec 1
                if (first2GreaterThanSecond2 || secondequals){ // assume first 2 greater than or equal to sec 2
                    ans++;
                }
            }else{
                if (firstequals){ // assume first 1 == sec 1
                    ans++;
                }else{ // assume first 1 greater than sec 1
                    if (!(first2GreaterThanSecond2)){ // assume first 2 is less than or equal to to sec 2
                        ans++;
                    }
                }
            }
        }
        System.out.println (ans);
    }
}