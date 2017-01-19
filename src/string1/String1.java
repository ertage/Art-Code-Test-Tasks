package string1;

/**
 * Created by anastasiia.shvetsova on 1/19/2017.
 */
public class String1 {
    public static void main(String[] arg) {
        testHelloName();
    }

    public static String helloName(String name) {
        String greeting = "Hello " + name + "!";
        System.out.println(greeting);
        return greeting;
    }

    public static void testHelloName() {
        String name1 = "Bob";
        String name2 = "Alice";
        String name3 = "X";

        helloName(name1);
        helloName(name2);
        helloName(name3);
    }
}
