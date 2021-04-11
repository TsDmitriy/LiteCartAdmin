package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderStatusesPage extends MainPage{

    public OrderStatusesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Order Statuses\")]");

    public OrderStatusesPage checkHeadingOrderStatusesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Order Statuses", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
