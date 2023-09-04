import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class one {
    public static void main(String[] args) {
        // SortedMap<Integer, String> hm = new TreeMap<Integer, String>();
        // hm.put(1, "a");
        // hm.put(2, "c");
        // hm.put(3, "b");
        // System.out.println(hm.values());
        // List<Integer> al = new ArrayList<Integer>();
        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("minhaj", 1);
        mp.put("mizan", 1);
        for (Map.Entry val : mp.entrySet()) {
            System.out.println(val.getKey() + " " + val.getValue());

        }
        // Set res = mp.entrySet();
        // Iterator it = res.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // System.out.println(mp.values());

        Vector<Integer> al = new Vector<Integer>();
        al.add(4);
        al.add(5);
        al.add(6);
        // Using a for loop
        for (int i = 0; i < vector.size(); i++) {
            // System.out.println(vector.get(i));
            al.add(i);
        }
        Collections.sort(vector);
        // Using an enhanced for loop (foreach loop)
        for (Integer element : vector) {
            System.out.println(element);
        }
        // Enumeration en = al.elements();
        // while (en.hasMoreElements()) {
        // System.out.println(en.nextElement());
        // }
        // ListIterator it = al.listIterator(al.size());
        // while (it.hasPrevious()) {
        // System.out.println(it.previous());
        // }
        // System.out.println(al.get(1));
        // List<Integer> l = new Stack<Integer>();
        // List<Integer> l1 = new Vector<Integer>();
        // Set<Integer> s = new HashSet<Integer>();
        // SortedSet<Integer> s1 = new TreeSet<Integer>();
        // s1.add(1);
        // s1.add(5);
        // s1.add(2);
        // s1.add(3);
        // System.out.println(s1);

    }
}