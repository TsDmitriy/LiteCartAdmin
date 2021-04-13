import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void startDriver()  {
        new GoToMainPage().getpage();

    }
    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();
    }
}
