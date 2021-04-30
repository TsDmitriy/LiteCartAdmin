import net.lightbody.bmp.core.har.Har;
import org.junit.Test;


public class TestTask{

    @Test
    public void test() throws InterruptedException {

        Driver.getInstance().get("http://software-testing.ru/");
        Har har=Driver.proxy.endHar();
        har.getLog().getEntries().forEach(i-> System.out.println(i.getResponse().getStatus() + ":"+ i.getRequest().getUrl()));
//        Driver.getInstance().manage().logs().get("browser").forEach(i-> System.out.println(i));
    }
}