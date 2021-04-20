import org.junit.Test;


public class TestTask14 extends TestBase{


    @Test
    public void test() throws InterruptedException {
        new LoginPage().inputLoginAndPassword()
                .goToCountriesPage()
                .addNewCountry()
                .goToHrefSwitchToWindowAndClouse();

    }
}