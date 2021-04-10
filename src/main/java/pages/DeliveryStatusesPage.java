package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class DeliveryStatusesPage {

    public DeliveryStatusesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Delivery Statuses\")]");

    public DeliveryStatusesPage checkHeadingDeliveryStatusesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Delivery Statuses", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CatalogPage returnCatalogPage() {
        return new CatalogPage();
    }

}
