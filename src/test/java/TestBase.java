import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {
    @BeforeClass
    public static void startDriver() throws MalformedURLException {
        new GoToMainPage().getpage();

    }
    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();
    }
}
