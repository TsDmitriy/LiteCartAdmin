package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderTotalPage extends ModulesPage{

    public OrderTotalPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Order Total Modules\")]");

    public OrderTotalPage checkHeadingOrderTotalPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Order Total Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
