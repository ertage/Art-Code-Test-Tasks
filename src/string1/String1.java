package string1;

/**
 * Created by anastasiia.shvetsova on 1/19/2017.
 */
public class String1 {
    public static void main(String[] arg) {
        testHelloName();
        testMakeOutWord();
        testFirstHalf();
        testNonStart();
        testTheEnd();
        testEndsLy();
        testMiddleThree();
        testLastChars();
        testSeeColor();
    }

    public static String helloName(String name) {
        String greeting = "Hello " + name + "!";
        System.out.println(greeting);
        return greeting;
    }

    public static void testHelloName() {
        helloName("Bob");
        helloName("Alice");
        helloName("X");
    }

    public static String makeOutWord(String out, String word) {
        String beginString = out.substring(0, 2);
        String endString = out.substring(2);
        String newString = beginString + word + endString;
        System.out.println("new string " + newString);
        return newString;
    }

    public static void testMakeOutWord() {
        makeOutWord("<<>>", "Yay");
        makeOutWord("<<>>", "WooHoo");
        makeOutWord("[[]]", "word");
    }

    public static String firstHalf(String str) {
        int index = (str.length()) / 2;
        String newString = str.substring(0, index);
        System.out.println("new string " + newString);
        return newString;
    }

    public static void testFirstHalf() {
        firstHalf("WooHoo");
        firstHalf("HelloThere");
        firstHalf("abcdef");
    }

    public static String nonStart(String a, String b) {
        String newString = a.substring(1) + b.substring(1);
        System.out.println("new string " + newString);
        return newString;
    }

    public static void testNonStart() {
        nonStart("Hello", "There");
        nonStart("java", "code");
        nonStart("shotl", "java");
    }

    public static String theEnd(String str, boolean front) {
        String newString;
        if (front == true) {
            newString = str.substring(0, 1);
        } else {
            newString = str.substring(str.length() - 1);
        }
        System.out.println("new string " + newString);
        return newString;
    }

    public static void testTheEnd() {
        theEnd("Hello", true);
        theEnd("Hello", false);
        theEnd("oh", true);
    }

    public static boolean endsLy(String str) {
        boolean result = false;

        if (str.length() >= 2) {
            String end = str.substring(str.length() - 2);
            if (end.equals("ly")) {
                result = true;
            }
        }

        System.out.println(result);
        return result;
    }

    public static void testEndsLy() {
        endsLy("oddly");
        endsLy("y");
        endsLy("oddy");
    }

    public static String middleThree(String str) {
        String substring = str.substring((str.length() / 2) - 1, ((str.length() / 2) + 2));
        System.out.println("new string " + substring);
        return substring;
    }

    public static void testMiddleThree() {
        middleThree("Candy");
        middleThree("and");
        middleThree("solving");
    }

    public static String lastChars(String a, String b) {
        String substring;
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        substring = a.substring(0, 1) + b.substring(b.length() - 1);
        System.out.println(substring);
        return substring;

    }

    public static void testLastChars() {
        lastChars("last", "chars");
        lastChars("yo", "java");
        lastChars("hi", "");
    }

    public static String seeColor(String str) {
        String substring = "";
        String beginRed;
        String beginBlue;
        if (str.length() >= 3) {
            beginRed = str.substring(0, 3);
            if (beginRed.equals("red")) {
                substring = "red";
            }
        }
        if (str.length() >= 4) {
            beginBlue = str.substring(0, 4);
            if (beginBlue.equals("blue")) {
                substring = "blue";
            }
        }
        System.out.println(substring);
        return substring;
    }

    public static void testSeeColor() {
        seeColor("redxx");
        seeColor("xxred");
        seeColor("blueTimes");
    }

}