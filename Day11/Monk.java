import java.util.*;

public class Monk {
    private ArrayList <Integer> items;
    private int div;

    public Monk (ArrayList <Integer> items, int div){
        this.items = items;
        this.div = div;
    }

    public boolean test (int index){
        return (items.get(index) % div == 0);
    }

    public int get (int i){
        return items.get(i);
    }

    public void add (int item){
        items.add (item);
    }

    public int size (){
        return items.size();
    }

    public void operation (int index, int item){
        items.set (index, item);
    }

    public void change (Monk other, int index){
        other.add (items.get(index));
        items.remove (index);
    }

    public static ArrayList <Integer> toArrayList (int [] list){
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i < list.length; i++){
            arr.add (list[i]);
        }
        return arr;
    }
    public static void main (String [] args){
        int [] list1 = {71, 86};
        Monk one = new Monk (toArrayList(list1), 19);
        int [] list2 = {66, 50, 90, 53, 88, 85};
        Monk two = new Monk (toArrayList(list2), 2);
        int [] list3 = {97, 54, 89, 62, 84, 80, 63};
        Monk three = new Monk (toArrayList(list3), 13);
        int [] list4 = {82, 97, 56, 92};
        Monk four = new Monk (toArrayList(list4), 5);
        int [] list5 = {50, 99, 67, 61, 86};
        Monk five = new Monk (toArrayList(list5), 7);
        int [] list6 = {61, 66, 72, 55, 64, 53, 72, 63};
        Monk six = new Monk (toArrayList(list6), 11);
        int [] list7 = {59, 79, 63};
        Monk seven = new Monk (toArrayList(list7), 17);
        int [] list8 = {55};
        Monk eight = new Monk (toArrayList(list8), 3);
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;
        int score5 = 0;
        int score6 = 0;
        int score7 = 0;
        int score8 = 0;
        for (int rounds = 0; rounds < 20; rounds++){
            for (int i = 0; i < one.size(); i++){
                one.operation(i, one.get(i) * 13);
                one.operation(i, (one.get(i) / 3));
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
                two.operation(i, (two.get(i) / 3));
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
                three.operation(i, (three.get(i) / 3));
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
                four.operation(i, (four.get(i) / 3));
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
                five.operation(i, (five.get(i) / 3));
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
                six.operation(i, (six.get(i) / 3));
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
                seven.operation(i, (seven.get(i) / 3));
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
                eight.operation(i, (eight.get(i) / 3));
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
        int [] sort = {score1,score2,score3,score4,score5,score6,score7,score8};
        Arrays.sort (sort);
        for (int i = 0; i < sort.length; i++){
            System.out.println (sort[i]);
        }
        System.out.println (sort[6] * sort[7]);
    }
}
