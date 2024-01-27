package Polymorphism.Overriding;

import Common.BaseTest;
import Polymorphism.DemoOverloading;

public class DemoGhide extends BaseTest {
    public void createBrowser(){
        System.out.println("Run Chrome");
        System.out.println("Class con");
    }

    //Ghi de khi chay auto hoac dung super.
    public void testAddUser(){
        createBrowser();
    }
    public static void main(String[] args) {
        DemoGhide ghide = new DemoGhide();
        ghide.createBrowser();
    }
}
