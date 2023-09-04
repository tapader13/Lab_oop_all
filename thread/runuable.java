class A implements Runnable {

    public void run() {
        for (int index = 0; index < 10; index++) {
            System.out.println("minhaj");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int index = 0; index < 12; index++) {
            System.out.println(index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class runuable {
    public static void main(String[] args) throws Exception {
        B b = new B();
        A a = new A();
        // b.setPriority(9);
        // System.out.println(b.getPriority());
        Thread tr1 = new Thread(a, "minhaj");
        Thread tr2 = new Thread(b);
        tr1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        tr2.start();
        System.out.println(tr1.getName());
        // tr1.join();
        System.out.println(tr2.isAlive());
        tr2.join();

        System.out.println("hello threads");
    }
}
