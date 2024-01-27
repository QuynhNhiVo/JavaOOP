package Polymorphism;

public class DemoOverloading {
    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public  int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public  double sum(int num1, int num2, double num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        DemoOverloading napChong = new DemoOverloading();
        System.out.println(napChong.sum(4, 5));
        System.out.println(napChong.sum(2, 6, 9));
    }
}
