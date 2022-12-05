import java.nio.charset.StandardCharsets;

public class HelloString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab" + "c";
        System.out.println(str1==(str2));
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = "Hello".getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);


        }

    }
}
