package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.Driver;
import pages.GoToLoginPage;
import pages.MainPage;


public class TestCase {
    @BeforeClass
    public static void startDriver() {
        new GoToLoginPage().getpage();

    }

    @Test
    public void test() {
        new MainPage()
                .inputLoginAndPassword();
    }

    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();

    }

}