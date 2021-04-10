package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PagesPage {

    public PagesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Pages\")]");

    public PagesPage checkHeadingPages() {
        Assert.assertEquals("Некорректный заголовок страницы", "Pages", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public MainPage returnMainPage() {
        return new MainPage();
    }
}
