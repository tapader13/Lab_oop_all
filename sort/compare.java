import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compare {
    int roll;
    int age;
    String name;

    public compare(int roll, int age, String name) {
        this.age = age;
        this.name = name;
        this.roll = roll;
    }

    static Comparator<compare> com = new Comparator<compare>() {
        @Override
        public int compare(compare o1, compare o2) {
            int rollCom = Integer.compare(o1.roll, o2.roll);
            if (rollCom == 0) {
                int ageCom = Integer.compare(o1.age, o2.age);
                if (ageCom == 0) {
                    return o1.name.compareTo(o2.name);
                }
                return ageCom;
            }
            return rollCom;
        }

        // @Override
        // public int compare(compare o1, compare o2) {
        // return o2.name.compareTo(o1.name);
        // }
        // @Override
        // public int compare(compare o1, compare o2) {
        // return Integer.compare(o1.age, o2.age);
        // }

    };
    // static Comparator<compare> rev = Collections.reverseOrder(com);

    public static void main(String[] args) {
        List<compare> li = new ArrayList<>();
        li.add(new compare(13, 22, "minhaj"));
        li.add(new compare(14, 12, "ninhaj"));
        li.add(new compare(11, 18, "kinhaj"));
        Collections.sort(li, com);
        // Collections.sort(li, rev);
        for (compare item : li) {
            System.out.println(item.roll + " " + item.age + " " + item.name);
        }

    }
}