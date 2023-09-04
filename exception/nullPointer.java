public class nullPointer {
    public static void main(String[] args) throws NullPointerException {
        String str = null;
        System.out.println("hi");
        // try {
        if (str == null) {
            throw new NullPointerException();
        }
        System.out.println(str.length());
        // } catch (Exception e) {
        // System.out.println(e.getLocalizedMessage());
        // }
        System.out.println("hello");
    }
}