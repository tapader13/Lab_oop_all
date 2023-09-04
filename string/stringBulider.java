public class stringBulider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java
        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello
        sb.replace(1, 3, "Java");
        System.out.println(sb);// prints HJavalo
        sb.delete(1, 3);
        System.out.println(sb);// prints Hlo
        sb.reverse();
        System.out.println(sb);// prints olleH
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity());// now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity());// now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.ensureCapacity(10);// now no change
        System.out.println(sb.capacity());// now 34
        sb.ensureCapacity(50);// now (34*2)+2
        System.out.println(sb.capacity());// now 70
        System.out.println("Original StringBuilder: " + sb);
        StringBuilder sb1 = sb.replace(2, 6, "like");
        System.out.println("New StringBuilder: " + sb1);
        StringBuilder sb2 = sb.delete(5, 17);
        System.out.println("After delete operation: " + sb2);
        StringBuilder sb3 = sb2.deleteCharAt(6);
        System.out.println("After deleteCharAt operation: " + sb3);
        String str = sb.toString();
        System.out.println("String form of StringBuilder: " + str);
        String s1 = sb.substring(0, 9);
        System.out.println("Substring: " + s1);
    }
}
