package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SoldOutStatusesPage {

    public SoldOutStatusesPage() {
        Helpers.waitLoadPage();
    }


    private By headingPage = By.xpath("//h1[contains(.,\" Sold Out Statuses\")]");

    public SoldOutStatusesPage checkHeadingSoldOutStatusesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Sold Out Statuses", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }


}
