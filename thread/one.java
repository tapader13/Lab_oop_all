class A extends Thread {
    public void run() {
        for (int index = 0; index < 40; index++) {
            System.out.println("minhaj");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int index = 0; index < 40; index++) {
            System.out.println(index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class one {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        // b.setPriority(9);
        // System.out.println(b.getPriority());
        a.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        b.start();
    }
}