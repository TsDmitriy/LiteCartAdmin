package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ShippingPage extends ModulesPage{

    public ShippingPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Shipping Modules\")]");

    public ShippingPage checkHeadingModulesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Shipping Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
