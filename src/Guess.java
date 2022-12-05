import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        int res = new Random().nextInt(100);
        while(true) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            if(n > res ) {
                System.out.println("da了");
            } else if (n < res)  {
                System.out.println("xiao了");
            } else {
                System.out.println("z正好");
                break;
            }
        }
    }
}
