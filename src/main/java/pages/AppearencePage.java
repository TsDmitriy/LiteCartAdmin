package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AppearencePage {
    public AppearencePage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Template\")]");

    public AppearencePage checkHeadingPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Template", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public MainPage returnMainPage() {
        return new MainPage();
    }
}
