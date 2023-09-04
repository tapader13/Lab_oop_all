public class multipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 8, c;
            System.out.println(a / b);
            String str = "minhaj";
            System.out.println(str.length());
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
