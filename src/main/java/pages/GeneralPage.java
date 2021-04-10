package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class GeneralPage {

    public GeneralPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");

    public GeneralPage checkHeadingGeneralPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public SettingsPage returnSettingsPage() {
        return new SettingsPage();
    }

}
