import java.util.*;

public class Part1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int cycle = 0;
        int x = 1;
        int amount = 0;
        int counter = 0;
        int sum = 0;
        while (sc.hasNextLine()){
            String input = sc.next();
            if (input.equals ("addx")){
                amount = sc.nextInt();
                cycle++;
                if ((cycle - 20) % 40 == 0){
                    sum += x * cycle;
                    System.out.println (cycle + " " + x);
                }
                cycle++;
                if ((cycle - 20) % 40 == 0){
                    sum += x * cycle;
                    System.out.println (cycle + " " + x);
                }
                x += amount;
            }else{
                cycle++;
                if ((cycle - 20) % 40 == 0){
                    sum += x * cycle;
                    System.out.println (cycle + " " + x);
                }
            }
        }
        System.out.println(sum);
    }
}
