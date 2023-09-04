interface Student {
    void name();

    void roll();
}

class minhaj implements Student {
    public void name() {
        System.out.println("my name is minhaj");
    }

    public void roll() {
        System.out.println("Roll 13");
    }
}

class toukir implements Student {
    public void name() {
        System.out.println("my name is toukir");
    }

    public void roll() {
        System.out.println("Roll 28");
    }
}

public class basic {
    public static void main(String[] args) {
        Student st = new minhaj();
        st.name();
        st.roll();
        Student st1 = new toukir();
        st1.name();
        st1.roll();
    }
}