package ObjectClass;

public class Student {
    String name;
    int age;
    static String phone;

    //Hàm xây dụng được gọi khi khởi tạo đối tượng class
    //Khai baó hàm xây dụng không có tham số
    public Student(){
    }

    //Khai baó hàm xây dụng có tham số
    public Student(String name, int age, String phone1){
        this.name = name; //This phân biệt biến trong class và tham số trùng tên
        this.age = age;
        phone = phone1;
    }

    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
    }

    public static void main(String[] args) {

        //Khởi tạo đối tượng class
        Student student = new Student("Ten", 13, "2943538");
        student.getInfo();

        //Biến Static mang giá trị cộng dồn, chỉ xóa khi chương trình dừng, đã gán value cho phone1 trước
        Student student1 = new Student();
        student1.getInfo();
    }
}
