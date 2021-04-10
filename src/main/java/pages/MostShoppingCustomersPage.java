package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class MostShoppingCustomersPage {

    public MostShoppingCustomersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Most Shopping Customers\")]");

    public MostShoppingCustomersPage checkHeadingMostShoppingCustomersPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Most Shopping Customers", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public ReportsPages returnReportsPages() {
        return new ReportsPages();
    }
}
