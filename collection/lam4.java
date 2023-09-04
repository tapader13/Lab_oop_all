interface Sayable {
    public String say(String name);
}

public class lam4 {
    public static void main(String[] args) {
        // without
        Sayable d = new Sayable() {
            public String say(String name) {
                return ("Drawing " + name);
            }

        };
        System.out.println(d.say("minhaj"));
        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
