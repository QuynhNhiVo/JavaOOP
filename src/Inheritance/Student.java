package Inheritance;

public class Student extends Person{
    public Student(int age, float height, String name, String address) {
        super(name, age, height);
    }

    public static void main(String[] args) {

        Student student = new Student(23, 123,"Ja",  "Hochiminh");
        student.getInfo();
    }
}
