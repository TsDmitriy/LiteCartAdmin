package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ListingsPage {
    public ListingsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");

    public ListingsPage checkHeadingListingsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public SettingsPage returnSettingsPage() {
        return new SettingsPage();
    }
}
