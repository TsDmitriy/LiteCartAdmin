package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class VQmodsPage extends MainPage {
    public VQmodsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" vQmods\")]");


    public VQmodsPage checkHeadingVQmodsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "vQmods", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
