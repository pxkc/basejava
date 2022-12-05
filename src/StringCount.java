import java.util.Scanner;

/**
 * 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要统计的字符串");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        int countUp = 0;
        int countLow = 0;
        int countNum = 0;
        int countOther = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c - 'A' >= 0 && c - 'Z' <= 0) {
                countUp++;
            } else if (c - '0' >= 0 && c - '9' <= 0) {
                countNum++;
            } else if (c - 'a' >= 0 && c - 'z' <= 0) {
                countLow++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写：" + countUp + " 小写：" + countLow + " 数字：" + countNum + " 其他：" + countOther);
    }
}
