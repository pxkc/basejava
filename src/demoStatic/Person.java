package demoStatic;

public class Person {
    static  {
        System.out.println("静态代码块执行！");
    }
    Person(){
        System.out.println("我是构造方法");
    }
}
