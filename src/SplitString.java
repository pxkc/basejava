public class SplitString {
    public static void main(String[] args) {
        String str1 = "abc,cba,adbc";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String str2 = "acbs.cad.aet";
        String[] arr = str2.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
