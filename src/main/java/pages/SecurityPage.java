package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SecurityPage extends SettingsPage{

    public SecurityPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");

    public SecurityPage checkHeadingSecurityPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public SettingsPage returnSettingsPage() {
        return new SettingsPage();
    }

}
