package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ManufacturersPage {

    public ManufacturersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Manufacturers\")]");

    public ManufacturersPage checkHeadingManufacturerPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Manufacturers", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }


}
