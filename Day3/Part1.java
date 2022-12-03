import java.util.*;
import java.io.*;

public class Part1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        HashMap <Character, Integer> bruh = new HashMap <>();
        bruh.put ('a', 1);
        bruh.put ('b', 2);
        bruh.put ('c', 3);
        bruh.put ('d', 4);
        bruh.put ('e', 5);
        bruh.put ('f', 6);
        bruh.put ('g', 7);
        bruh.put ('h', 8);
        bruh.put ('i', 9);
        bruh.put ('j', 10);
        bruh.put ('k', 11);
        bruh.put ('l', 12);
        bruh.put ('m', 13);
        bruh.put ('n', 14);
        bruh.put ('o', 15);
        bruh.put ('p', 16);
        bruh.put ('q', 17);
        bruh.put ('r', 18);
        bruh.put ('s', 19);
        bruh.put ('t', 20);
        bruh.put ('u', 21);
        bruh.put ('v', 22);
        bruh.put ('w', 23);
        bruh.put ('x', 24);
        bruh.put ('y', 25);
        bruh.put ('z', 26);
        bruh.put ('A', 27);
        bruh.put ('B', 28);
        bruh.put ('C', 29);
        bruh.put ('D', 30);
        bruh.put ('E', 31);
        bruh.put ('F', 32);
        bruh.put ('G', 33);
        bruh.put ('H', 34);
        bruh.put ('I', 35);
        bruh.put ('J', 36);
        bruh.put ('K', 37);
        bruh.put ('L', 38);
        bruh.put ('M', 39);
        bruh.put ('N', 40);
        bruh.put ('O', 41);
        bruh.put ('P', 42);
        bruh.put ('Q', 43);
        bruh.put ('R', 44);
        bruh.put ('S', 45);
        bruh.put ('T', 46);
        bruh.put ('U', 47);
        bruh.put ('V', 48);
        bruh.put ('W', 49);
        bruh.put ('X', 50);
        bruh.put ('Y', 51);
        bruh.put ('Z', 52);

        int sum = 0;
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            int length = s.length() / 2;
            String sub1 = s.substring(0,length);
            String sub2 = s.substring(length);
            for (int i = 0; i < length; i++){
                char c = sub1.charAt(i);
                if (sub2.indexOf(c) > -1){
                    sum += bruh.get(c);
                    break;
                }
            }
        }
        System.out.println (sum);
    }
}
