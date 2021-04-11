package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SlidesPage extends MainPage{

    public SlidesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Slides\")]");

    public SlidesPage checkHeadingSlidesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Slides", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
