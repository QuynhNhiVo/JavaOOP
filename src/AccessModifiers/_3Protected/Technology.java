package AccessModifiers._3Protected;

import AccessModifiers._0Common.BaseTest;

public class Technology extends BaseTest{
    public void showInfo() {
        Computer computer = new Computer();
        System.out.println(computer.getComputerName());

        //Ke thua
        System.out.println(getBrower());
    }

    public static void main(String[] args) {
        Technology technology = new Technology();
        technology.showInfo();
    }
}
