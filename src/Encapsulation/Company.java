package Encapsulation;

public class Company {
    public static void main(String[] args) {
        Student student = new Student("B" , 25, "231623", "HoChiMinh");

        student.setAge(17);
        System.out.println("Tính đóng gói");
        System.out.println(student.getName());
        System.out.println(student.getAge());
//        System.out.println(student.getPhone());
        System.out.println(student.getAddress());

    }
}
