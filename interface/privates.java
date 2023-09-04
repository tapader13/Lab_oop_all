interface Student {
    public static void call() {

        add(10, 2);
    }

    // default void call() {
    // add(10, 2);
    // }
    private static void add(int a, int b) {
        System.out.println((a + b));
    }
    // private void add(int a, int b) {
    // System.out.println((a + b));
    // }

}

class toukir implements Student {
    public void sub(int a, int b) {
        System.out.println((a - b));
    }

}

public class privates {
    public static void main(String[] args) {
        toukir st = new toukir();
        st.sub(10, 2);
        // st.call();
        Student.call();

    }
}
