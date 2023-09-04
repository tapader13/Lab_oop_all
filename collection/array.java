import java.util.*;

public class array extends Thread {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5, 5); // inserts 5 at the 5th index in l1

        System.out.println("Array list before : " + l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);
        System.out.println("Array list : " + l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.add(6);

        l4.add(11);
        l4.add(12);
        l4.add(13);
        l4.add(14);

        System.out.println("L3 Array list : " + l3);
        System.out.println("L4 Array list : " + l4);
        l3.addAll(l4);
        System.out.println("L3 Array list after merging: " + l3);
        System.out.println("L4 Array list : " + l4);

        System.out.println("L1 Array list : " + l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
    }
}
