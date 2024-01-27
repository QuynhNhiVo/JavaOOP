package Encapsulation;

public class Inheritance extends Student {
    public void showInfo(){
        setName("D");
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress());
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        inheritance.showInfo();
    }
}
