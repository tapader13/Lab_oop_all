public class trycatch {
    public static void main(String[] args) {
        int a = 10, b = 7, c = 0;
        System.out.println("hi");
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("hello");
        }

    }
}