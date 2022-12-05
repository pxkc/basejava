import java.util.Random;
public class R {
    public static void main(String[] args) {
        Random rdm = new Random();
        for(int i = 0; i < 6; i ++ ) {
            System.out.println(rdm.nextInt());
        }
    }
}
