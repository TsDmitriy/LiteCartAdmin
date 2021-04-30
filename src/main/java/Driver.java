import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver {
    public static BrowserMobProxy proxy ;
    private static ChromeDriver instance;


    public static void setnull() {
        instance = null;
    }

    public static class MyListener extends AbstractWebDriverEventListener {
        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by);
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by + " found");
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println(throwable);
        }
    }
    private Driver() {

    }

    /**
     * Метод проверяет есть ли instance WebDriver, если нет, то создает новый
     * @return instance
     */
    public static WebDriver getInstance() {

        if (instance == null) {
            proxy =new BrowserMobProxyServer();
            proxy.start(0);
            Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            instance = new ChromeDriver(new ChromeOptions().setProxy(seleniumProxy).setAcceptInsecureCerts(true));
            Driver.proxy.newHar();
//            instance.register(new MyListener());
            instance.manage().window().maximize();
        }
        return instance;
    }

    /**
     * Метод который завершает работу браузера и сервисов
     */
    public static void stopDriver () {
        instance.quit();
        instance = null;
    }
}