package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OptionGroupsPage {

    public OptionGroupsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Option Groups\")]");

    public OptionGroupsPage checkHeadingOptionGroupsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Option Groups", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }
}
