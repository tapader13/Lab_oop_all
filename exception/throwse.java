public class throwse {

    public static void main(String[] args) throws InterruptedException {
        int v = 10;
        for (int i = 0; i < v; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

}
