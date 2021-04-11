package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderSuccessPage extends ModulesPage{

    public OrderSuccessPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Order Success Modules\")]");

    public OrderSuccessPage checkHeadingOrderSuccessPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Order Success Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
