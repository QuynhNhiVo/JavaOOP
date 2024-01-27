package Encapsulation;

public class CompanyNone {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("V");
        student.setAge(21);
        System.out.println(student.getName()+" "+ student.getAge());
    }
}
