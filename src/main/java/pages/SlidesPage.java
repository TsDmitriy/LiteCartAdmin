package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SlidesPage {

    public SlidesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Slides\")]");

    public SlidesPage checkHeadingSlidesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Slides", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
