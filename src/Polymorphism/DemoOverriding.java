package Polymorphism;

import Common.BaseTest;

public class DemoOverriding extends BaseTest {
    public void createBrowser(){
        System.out.println("Run Chrome");
        System.out.println("Class con");
    }

    //Ghi de khi chay auto hoac dung super.
    public void testAddUser(){
        createBrowser();
    }
    public static void main(String[] args) {
        DemoOverriding ghide = new DemoOverriding();
        ghide.createBrowser();
    }
}
