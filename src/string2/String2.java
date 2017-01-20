package string2;

/**
 * Created by anastasiia.shvetsova on 1/19/2017.
 */
public class String2 {
    public static void main(String arg[]) {
        testDoubleChar();
        testCountCode();
        testBobThere();
        testRepeatEnd();
    }

    public static String doubleChar(String str) {
        char[] chars = str.toCharArray();
        String newString = "";
        for (int i = 0; i < chars.length; i++) {
            newString = newString + chars[i] + chars[i];
        }
        System.out.println(newString);
        return newString;
    }

    public static void testDoubleChar() {
        doubleChar("The");
        doubleChar("AAbb");
        doubleChar("Hi-There");
    }

    public static int countCode(String str) {
        char[] chars = str.toCharArray();
        int times = 0;
        for (int i = 0; i < chars.length - 3; i++) {
            if ((chars[i] == 'c') && (chars[i + 1] == 'o') && (chars[i + 3] == 'e')) {
                times++;
            }
        }
        System.out.println(times);
        return times;
    }

    public static void testCountCode() {
        countCode("aaacodebbb");
        countCode("codexxcode");
        countCode("cozexxcope");
    }

    public static boolean bobThere(String str) {
        char[] chars = str.toCharArray();
        boolean result = false;
        for (int i = 0; i < chars.length - 2; i++) {
            if ((chars[i] == 'b') && (chars[i + 2] == 'b')) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void testBobThere() {
        countCode("abcbob");
        countCode("b9b");
        countCode("bac");
    }

    public static String repeatEnd(String str, int n) {
        String substring = str.substring(str.length() - n);
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString = newString + substring;
        }
        System.out.println(newString);
        return newString;
    }

    public static void testRepeatEnd() {
        repeatEnd("Hello", 3);
        repeatEnd("Hello", 2);
        repeatEnd("Hello", 1);
    }
}
