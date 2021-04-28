import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class TestTask{

    @Test
    public void test() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "90");
        chromeOptions.setCapability("platformName", "Windows");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), chromeOptions);

    }
}