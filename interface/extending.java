interface Student {
    void name();

}

interface Teacher extends Student {
    void roll();

}

class toukir implements Teacher {
    String name;
    int roll;

    toukir(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void name() {
        System.out.println("name: " + name);
    }

    public void roll() {
        System.out.println("roll: " + roll);
    }

}

public class extending {
    public static void main(String[] args) {
        toukir st = new toukir("minhaj", 13);
        st.name();
        st.roll();

    }
}
