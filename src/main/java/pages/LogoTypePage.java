package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class LogoTypePage extends MainPage {

    public LogoTypePage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Logotype\")]");
    private By сatalog = By.xpath("//span[contains(.,'Catalog')]");

    public LogoTypePage checkHeadingLogotypePage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Logotype", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
