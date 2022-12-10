package ArraysAPI.extendsDemo;

public class NewPhone extends Phone{
    @Override
    public void show() {
//        System.out.println("显示号码");
        super.show();//把父类的代码重复利用加入新的功能
        System.out.println("显示头像");
        System.out.println("显示头像");
    }
}
