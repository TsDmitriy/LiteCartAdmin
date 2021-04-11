package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ModulesPage extends MainPage{

    public ModulesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Job Modules\")]");
    private By customer = By.id("doc-customer");
    private By shipping = By.id("doc-shipping");
    private By payment = By.id("doc-payment");
    private By orderTotal = By.id("doc-order_total");
    private By orderSuccess = By.id("doc-order_success");
    private By orderAction = By.id("doc-order_action");


    public ModulesPage checkHeadingModulesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Job Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ModulesCustomerPage goToModulesCustomerPage ()  {
        Helpers.click(customer);
        return new ModulesCustomerPage();
    }

    public ShippingPage goToShippingPage ()  {
        Helpers.click(shipping);
        return new ShippingPage();
    }

    public PaymentPage goToPaymentPage ()  {
        Helpers.click(payment);
        return new PaymentPage();
    }

    public OrderTotalPage goToOrderTotalPage()  {
        Helpers.click(orderTotal);
        return new OrderTotalPage();
    }

    public OrderSuccessPage goToOrderSuccessPage()  {
        Helpers.click(orderSuccess);
        return new OrderSuccessPage();
    }

    public OrderActionPage goToOrderActionPage()  {
        Helpers.click(orderAction);
        return new OrderActionPage();
    }
}
