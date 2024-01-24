package Inheritance;

import Common.BaseTest;

public class LoginTest extends BaseTest {
    public void testLoginsuccess(){
        createBrowser();

        closeBrowser();
    }
    public void testLoginWithEmailInvalid(){
        createBrowser();

        closeBrowser();
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.testLoginsuccess();
        loginTest.testLoginWithEmailInvalid();
    }
}
