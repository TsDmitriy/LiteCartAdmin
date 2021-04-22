import org.openqa.selenium.By;

public class LiteCart {
    public LiteCart() {
        Helpers.presenceOfElementLocated(query);
    }

    private By query = By.name("query");
    private By name = By.className("name");

    public void checkMyProductInLiteCart() {
        Helpers.presenceOfElementLocated(By.xpath("//*[@class=\"name\"][text()=\""+Stash.getValue("myProduct") +"\"]"));    }
}
