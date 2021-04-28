import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver {

    private static EventFiringWebDriver instance;


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

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            instance = new EventFiringWebDriver(new ChromeDriver());
            instance.register(new MyListener());
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