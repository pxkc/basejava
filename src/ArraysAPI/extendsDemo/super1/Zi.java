package ArraysAPI.extendsDemo.super1;

public class Zi extends Fu{
    int num = 200;
    public Zi(){
        super();
    }
    public void methodZi(){
        System.out.println(super.num);
    }

    public void method(){
        super.method();
        System.out.println("已经调用父类");
    }

}
