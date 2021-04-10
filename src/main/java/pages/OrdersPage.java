package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrdersPage {

    public OrdersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Orders\")]");
    private By orderStatuses =By.xpath("//span[contains(.,\"Order Statuses\")]");


    public OrdersPage checkHeadingOrdersPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Orders", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public OrderStatusesPage goToOrderStatusesPage() {
        Helpers.click(orderStatuses);
        return new OrderStatusesPage();
    }
}
