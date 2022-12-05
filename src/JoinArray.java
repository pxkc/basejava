public class JoinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = fromArrayToString(arr);
        System.out.println(result);
    }
    public static String fromArrayToString(int[] arr) {
        String res = "";
        res += "[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if(i == arr.length - 1) {
                res += "]";
            } else{
                res += "#";
            }
        }
        return res;
    }
}
