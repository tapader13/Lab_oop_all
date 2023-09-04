interface Student {
    void name();

}

interface Teacher {
    void name();

}

class toukir implements Student, Teacher {
    String name;

    toukir(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("name: " + name);
    }

}

public class multipleInterface {
    public static void main(String[] args) {
        Student st = new toukir("minhaj");
        Teacher st1 = new toukir("abir");
        st.name();
        st1.name();

    }
}
