import java.util.*;

public class Monk2 {
    private ArrayList <Long> items;
    private int div;

    public Monk2 (ArrayList <Long> items, int div){
        this.items = items;
        this.div = div;
    }

    public boolean test (int index){
        return (items.get(index) % div == 0);
    }

    public Long get (int i){
        return items.get(i);
    }

    public void add (Long item){
        items.add (item);
    }

    public int size (){
        return items.size();
    }

    public void printList (){
        System.out.println (items);
    }

    public void operation (int index, Long item){
        items.set (index, item % 9699690);
    }

    public void change (Monk2 other, int index){
        Long add = items.get(index) % 9699690;
        other.add (add);
        items.remove (index);
    }

    public static ArrayList <Long> toArrayList (int [] list){
        ArrayList <Long> arr = new ArrayList<>();
        for (int i = 0; i < list.length; i++){
            arr.add ((long)list[i]);
        }
        return arr;
    }
    public static void main (String [] args){
        int [] list1 = {71, 86};
        Monk2 one = new Monk2 (toArrayList(list1), 19);
        int [] list2 = {66, 50, 90, 53, 88, 85};
        Monk2 two = new Monk2 (toArrayList(list2), 2);
        int [] list3 = {97, 54, 89, 62, 84, 80, 63};
        Monk2 three = new Monk2 (toArrayList(list3), 13);
        int [] list4 = {82, 97, 56, 92};
        Monk2 four = new Monk2 (toArrayList(list4), 5);
        int [] list5 = {50, 99, 67, 61, 86};
        Monk2 five = new Monk2 (toArrayList(list5), 7);
        int [] list6 = {61, 66, 72, 55, 64, 53, 72, 63};
        Monk2 six = new Monk2 (toArrayList(list6), 11);
        int [] list7 = {59, 79, 63};
        Monk2 seven = new Monk2 (toArrayList(list7), 17);
        int [] list8 = {55};
        Monk2 eight = new Monk2 (toArrayList(list8), 3);
        long score1 = 0;
        long score2 = 0;
        long score3 = 0;
        long score4 = 0;
        long score5 = 0;
        long score6 = 0;
        long score7 = 0;
        long score8 = 0;
        for (long rounds = 0; rounds < 10000; rounds++){
            for (int i = 0; i < one.size(); i++){
                one.operation(i, one.get(i) * 13);
                boolean b = one.test(i);
                if (b){
                    one.change(seven, i);
                    i--;
                }else{
                    one.change(eight, i);
                    i--;
                }
                score1++;
            }
            for (int i = 0; i < two.size(); i++){
                two.operation(i, two.get(i) + 3);
                boolean b = two.test(i);
                if (b){
                    two.change(six, i);
                    i--;
                }else{
                    two.change(five, i);
                    i--;
                }
                score2++;
            }
            for (int i = 0; i < three.size(); i++){
                three.operation(i, three.get(i) + 6);
                boolean b = three.test(i);
                if (b){
                    three.change(five, i);
                    i--;
                }else{
                    three.change(two, i);
                    i--;
                }
                score3++;
            }
            for (int i = 0; i < four.size(); i++){
                four.operation(i, four.get(i) + 2);
                boolean b = four.test(i);
                if (b){
                    four.change(seven, i);
                    i--;
                }else{
                    four.change(one, i);
                    i--;
                }
                score4++;
            }
            for (int i = 0; i < five.size(); i++){
                five.operation(i, five.get(i) * five.get(i));
                boolean b = five.test(i);
                if (b){
                    five.change(six, i);
                    i--;
                }else{
                    five.change(four, i);
                    i--;
                }
                score5++;
            }
            for (int i = 0; i < six.size(); i++){
                six.operation(i, six.get(i) + 4);
                boolean b = six.test(i);
                if (b){
                    six.change(four, i);
                    i--;
                }else{
                    six.change(one, i);
                    i--;
                }
                score6++;
            }
            for (int i = 0; i < seven.size(); i++){
                seven.operation(i, seven.get(i) * 7);
                boolean b = seven.test(i);
                if (b){
                    seven.change(three, i);
                    i--;
                }else{
                    seven.change(eight, i);
                    i--;
                }
                score7++;
            }
            for (int i = 0; i < eight.size(); i++){
                eight.operation(i, eight.get(i) + 7);
                boolean b = eight.test(i);
                if (b){
                    eight.change(three, i);
                    i--;
                }else{
                    eight.change(two, i);
                    i--;
                }
                score8++;
            }
        }
        long [] sort = {score1,score2,score3,score4,score5,score6,score7,score8};
        Arrays.sort (sort);
        System.out.println (sort[6] + " " + sort[7]);
        System.out.println ((long)sort[6] * (long)sort[7]);
    }
}
