public class numberFormat {

    public static void main(String[] args) {
        String str = "minhaj";
        System.out.println("hi");
        try {

            System.out.println(Integer.parseInt(str));
            // System.out.println(str.length());
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("hello");
    }

}
