package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AppearencePage extends MainPage {
    public AppearencePage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Template\")]");
    private By logoType = By.id("doc-logotype");

    public AppearencePage checkHeadingPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Template", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public LogoTypePage goToLogotypePage() {
        Helpers.click(logoType);
        return new LogoTypePage();
    }
}
