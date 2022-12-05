import java.util.ArrayList;
import java.util.Random;

/**
 * 把大的集合变成偶数的小的集合
 */
public class ListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(r.nextInt(100) + 1);
        }
        ArrayList<Integer> smallList = getSmallList(arrayList);
        System.out.println(smallList.size());
        System.out.println(smallList);
        for (Integer sl : smallList) {
            System.out.println(sl);

        }
    }

    private static ArrayList<Integer> getSmallList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) {
                smallList.add(arrayList.get(i));
            }
        }
        return smallList;
    }
}
