package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderActionPage extends ModulesPage{

    public OrderActionPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Order Action Modules\")]");

    public OrderActionPage checkHeadingOrderActionPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Order Action Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
