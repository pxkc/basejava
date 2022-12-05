package demoStatic;

public class StaticField {
    public static void main(String[] args) {
        Student st1 = new Student("黄蓉", 16);
        Student st2 = new Student("郭靖", 20);

        st1.setRoom("101中学");
        System.out.println(st1.getId() + st1.getName() + st1.getRoom() + st1.getAge());

        System.out.println(st2.getId() + st2.getName() + st2.getRoom() + st2.getAge());
    }
}
