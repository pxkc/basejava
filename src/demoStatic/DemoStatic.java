package demoStatic;
/*
特点：当第一次用到本类时，静态代码块执行唯一的一次
静态内容总是优先于非静态，所以静态代码块先执行。
用来一次性地给静态成员变量赋值
 */
public class DemoStatic {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
