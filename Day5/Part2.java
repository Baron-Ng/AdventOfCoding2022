import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Part2{
    public static ArrayList<ArrayList<String>> makeStacks (){
        ArrayList <ArrayList<String>> stacks = new ArrayList <> ();
        ArrayList<String> stack1 = new ArrayList<>(Arrays.asList("B","Z","T"));
        ArrayList<String> stack2 = new ArrayList<>(Arrays.asList("V","H","T","D","N"));
        ArrayList<String> stack3 = new ArrayList<>(Arrays.asList("B","F","M","D"));
        ArrayList<String> stack4 = new ArrayList<>(Arrays.asList("T","J","G","W","V","Q","L"));
        ArrayList<String> stack5 = new ArrayList<>(Arrays.asList("W","D","G","P","V","F","Q","M"));
        ArrayList<String> stack6 = new ArrayList<>(Arrays.asList("V","Z","Q","G","H","F","S"));
        ArrayList<String> stack7 = new ArrayList<>(Arrays.asList("Z","S","N","R","L","T","C","W"));
        ArrayList<String> stack8 = new ArrayList<>(Arrays.asList("Z","H","W","D","J","N","R","M"));
        ArrayList<String> stack9 = new ArrayList<>(Arrays.asList("M","Q","L","F","D","S"));
        stacks.add (stack1);
        stacks.add (stack2);
        stacks.add (stack3);
        stacks.add (stack4);
        stacks.add (stack5);
        stacks.add (stack6);
        stacks.add (stack7);
        stacks.add (stack8);
        stacks.add (stack9);
        return stacks;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        ArrayList <ArrayList<String>> stacks = makeStacks();
        while (sc.hasNextLine()){
            sc.next();
            int amount = sc.nextInt();
            sc.next();
            int start = sc.nextInt() - 1;
            sc.next();
            int end = sc.nextInt() - 1;
            System.out.println(amount + " " + start + " " + end);
            int startIndex = stacks.get(start).size() - amount;
            for (int i = 0; i < amount; i++){
                stacks.get(end).add(stacks.get(start).get(startIndex));
                stacks.get(start).remove(startIndex);
            }
        }
        for (int j = 0; j < stacks.size(); j++){
            int size = stacks.get(j).size() - 1;
            String s = stacks.get(j).get(size);
            System.out.print (s);
        }
    }
}