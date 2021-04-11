package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AdvancedPage extends SettingsPage{

    public AdvancedPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");

    public AdvancedPage checkHeadingAdvancedPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public SettingsPage returnSettingsPage() {
        return new SettingsPage();
    }
}
