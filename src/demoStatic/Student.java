package demoStatic;

public class Student {
    private String name;
    private static  String room;
    private int age;
    private static int idCount;
    private int id;

    public Student() {
        this.id = idCount++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
