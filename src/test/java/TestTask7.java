import org.junit.Test;


public class TestTask7 extends TestBase{


    @Test
    public void test(){
        new LoginPage().inputLoginAndPassword()
                .clickMenuAndCheckHeadingPage();
    }
}