interface Student {
    void name();

    void roll();
}

abstract class minhaj implements Student {
    public void name() {
        System.out.println("my name is minhaj");
    }

}

class toukir extends minhaj {

    public void roll() {
        System.out.println("Roll 13");
    }
}

public class abhstract {
    public static void main(String[] args) {
        Student st = new toukir();
        st.name();
        st.roll();

    }
}
