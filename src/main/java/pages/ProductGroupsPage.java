package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductGroupsPage {

    public ProductGroupsPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Product Groups\")]");

    public ProductGroupsPage checkHeadingProductGroupsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Product Groups", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }


}
