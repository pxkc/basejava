package demoStatic;

//静态方法 可以用类名和对象名调用，推荐类名,
//静态不能访问非静态内容。
public class StaticMethod {
    public static void main(String[] args) {
        MyClass.methodStatic();
        MyClass myClass = new MyClass();
        myClass.methodStatic();
        StaticMethod.myMethod();
        myMethod();
    }

    private static void myMethod() {
        System.out.println("我是静态");
    }
}
