public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("小明", 0);
        Student s2 = new Student("小花",2);
        Student s3 = new Student("小红", 12);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0; i < students.length; i ++  ){
            Student s = students[i];
            System.out.println(s.getAge() + " " + s.getName());
        }
    }
}
