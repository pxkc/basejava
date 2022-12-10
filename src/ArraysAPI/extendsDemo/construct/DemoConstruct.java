package ArraysAPI.extendsDemo.construct;

/**
 * 继承关系中父子类构造方法的特点
 * 子类构造方法中有一个默认隐含的super()调用
 * 子类构造可以透过super关键字来调用父类的构造方法
 * 只有子类构造方法才能调用父类构造方法，必须放在第一行
 *
 * 总结：子类必须调用父类构造方法，不写则赠送suepr，写了用指定super，super只能有一个且必须是第一个
 */
public class DemoConstruct {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
