import java.util.*;

public class Part2 {
    public static boolean range (int x, int cycle){
        return (Math.abs (x - ((cycle-1) % 40)) <= 1);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int cycle = 0;
        int x = 1;
        int amount = 0;
        ArrayList <ArrayList<String>> tv = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            ArrayList <String> bruh = new ArrayList<>();
            for (int j = 0; j < 40; j++){
                bruh.add(".");
            }
            tv.add (bruh);
        }
        while (sc.hasNextLine()){
            String input = sc.next();
            if (input.equals ("addx")){
                amount = sc.nextInt();
                cycle++;
                if (range(x, cycle)){
                    tv.get((cycle-1) / 40).set(((cycle-1) % 40), "#");
                }
                cycle++;
                if (range(x, cycle)){
                    tv.get((cycle-1) / 40).set(((cycle-1) % 40), "#");
                }
                x += amount;
                System.out.println (cycle + " " + (cycle-1) / 40 + " " + x);
            }else{
                cycle++;
                if (range(x, cycle)){
                    tv.get((cycle-1) / 40).set(((cycle-1) % 40), "#");
                }
            }
        }
        System.out.println(tv.get(0));
        System.out.println(tv.get(1));
        System.out.println(tv.get(2));
        System.out.println(tv.get(3));
        System.out.println(tv.get(4));
        System.out.println(tv.get(5));
    }
}
