import java.util.*;
import java.io.*;

public class Part1{
    public static ArrayList <String[]> makeStacks (){
        ArrayList <ArrayList<String>> stacks = new ArrayList <> ();
        ArrayList<String> stack1 = ["B","Z","T"];
        ArrayList<String> stack2 = ["V","H","T","D","N"];
        ArrayList<String> stack3 = ["B","F","M","D"];
        ArrayList<String> stack4 = ["T","J","G","W","V","Q","L"];
        ArrayList<String> stack5 = ["W","D","G","P","V","F","Q","M"];
        ArrayList<String> stack6 = ["V","Z","Q","G","H","F","S"];
        ArrayList<String> stack7 = ["Z","S","N","R","L","T","C","W"];
        ArrayList<String> stack8 = ["Z","H","W","D","J","N","R","M"];
        ArrayList<String> stack9 = ["M","Q","L","F","D","S"];
        this.stacks.add (stack1);
        this.stacks.add (stack2);
        this.stacks.add (stack3);
        this.stacks.add (stack4);
        this.stacks.add (stack5);
        this.stacks.add (stack6);
        this.stacks.add (stack7);
        this.stacks.add (stack8);
        this.stacks.add (stack9);
        return stacks;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        ArrayList <String[]> stacks = makeStacks();
        while (sc.hasNextLine()){
            int amount = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int i = 0; i < amount; i++)
        }
    }
}