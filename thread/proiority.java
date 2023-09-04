class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;

        while (true) {
            // System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }

    }
}

public class proiority extends Thread {
    public void run() {
        System.out.println("I'm thread : " + Thread.currentThread().getName());
        System.out.println("I'm thread :" + Thread.currentThread().getPriority());

    }

    public static void main(String args[]) {
        proiority t1 = new proiority();
        proiority t2 = new proiority();
        t1.setPriority(Thread.MIN_PRIORITY); // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY); // setting priority of t2 thread to MAX_PRIORITY (10)
        t1.start();
        t2.start();

    }
}
