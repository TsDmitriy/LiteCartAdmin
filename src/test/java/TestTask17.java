import net.lightbody.bmp.core.har.Har;
import org.junit.Test;


public class TestTask17 extends TestBase {


    @Test
    public void test() throws InterruptedException {
        Driver.proxy.newHar();
        new LoginPage()
                .inputLoginAndPassword()
                .goToCatalogPage()
                .openFolder()
                .goToProductPageAndCheckErrorInBrowser();
        Har har = Driver.proxy.endHar();
        har.getLog().getEntries().forEach(i -> System.out.println(i.getResponse().getStatus() + ":" + i.getRequest().getUrl()));


    }
}