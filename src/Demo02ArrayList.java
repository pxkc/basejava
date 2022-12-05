import java.util.ArrayList;
import java.util.Arrays;

public class Demo02ArrayList {
    public static void main(String[] args) {
//        ArrayList <String> arrayList = new ArrayList();
//        arrayList.add("123");
//        for(Object o : arrayList) {
//            System.out.println(o);
//        }
//        for(int i = 0; i < arrayList.size(); i ++ ) {
//            System.out.println(arrayList.get(i));
//        }
//        StringBuffer str = new StringBuffer();
//        str.append("123");
//        String s1 = "123";
//        String s2 = s1.concat("567");
//        System.out.println(s2);
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.indexOf("0"));
//        System.out.println(s1.substring(2,3));
//        System.out.println("itcast".replace("it","ca"));
//        System.out.println();
//        String s = "aa|bb|cc";
//        String[] strArray = s.split("|");
//        String str = s.split("|")[0];
//        System.out.println(str);
//        String s1 = "aa|bb|cc";
//        String[] strArray1 = s1.split("|"); // ["aa","bb","cc"]
//        for(int x = 0; x < strArray1.length; x++) {
//            System.out.println(strArray1[x]); // aa bb cc
//        }
//        for(int x = 0; x < strArray.length; x ++){
//            System.out.println(strArray[x]);
//        }
        String s = "aa|bb|cc";
        String[] strArray = s.split("a|"); // ["aa","bb","cc"]
        for(int x = 0; x < strArray.length; x++) {
            System.out.print(strArray[x] + " "); // aa bb cc
        }
    }
}
