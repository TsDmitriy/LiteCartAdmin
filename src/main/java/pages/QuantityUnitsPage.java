package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class QuantityUnitsPage extends CatalogPage{

    public QuantityUnitsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Quantity Units\")]");

    public QuantityUnitsPage checkHeadingQuantityUnitsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Quantity Units", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
