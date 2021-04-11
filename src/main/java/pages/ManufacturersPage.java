package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ManufacturersPage extends CatalogPage{

    public ManufacturersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Manufacturers\")]");

    public ManufacturersPage checkHeadingManufacturerPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Manufacturers", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
