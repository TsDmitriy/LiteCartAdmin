package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SuppliersPage {

    public SuppliersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Suppliers\")]");

    public SuppliersPage checkHeadingSuppliersPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Suppliers", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }

}
