package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ImagesPage {

    public ImagesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");

    public ImagesPage checkHeadingImagesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public SettingsPage returnSettingsPage() {
        return new SettingsPage();
    }
}
