package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.Driver;
import pages.GoToLoginPage;
import pages.LoginPage;


public class TestCase {
    @BeforeClass
    public static void startDriver() {
        new GoToLoginPage().getpage();

    }

    @Test
    public void test() {
        new LoginPage()
                .inputLoginAndPassword();
    }

    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();

    }

}