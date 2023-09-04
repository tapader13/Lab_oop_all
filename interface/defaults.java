interface Student {
    void name();

    default void home() {
        System.out.println("home : sylhet ");
    };

    default void roll() {
        System.out.println("roll : 07");
    };

}

class toukir implements Student {

    public void name() {
        System.out.println("name: minhaj");
    }

    public void roll() {
        System.out.println("roll: 13");
    }

}

public class defaults {
    public static void main(String[] args) {
        toukir st = new toukir();
        st.name();
        st.roll();
        st.home();

    }
}
