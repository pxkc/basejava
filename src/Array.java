public class Array {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int[] result = calculate(1, 2, 3);
        System.out.println("Main方法中arr的地址值：" + result);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    private static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;
//        int[] arr = new int[];
//        arr[0] = sum;
//        arr[1] = avg;
        int []  arr = {sum, avg};
        System.out.println("方法内部的数组地址:" + arr);
        return arr;
    }

}
