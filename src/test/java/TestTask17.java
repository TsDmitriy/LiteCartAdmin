import org.junit.Test;


public class TestTask17 extends TestBase{


    @Test
    public void test() throws InterruptedException {
        new LoginPage()
                .inputLoginAndPassword()
                .goToCatalogPage()
                .openFolder()
                .goToProductPageAndCheckErrorInBrowser();


    }
}