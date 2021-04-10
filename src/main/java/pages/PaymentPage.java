package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PaymentPage {

    public PaymentPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Payment Modules\")]");

    public PaymentPage checkHeadingPaymentPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Payment Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ModulesPage returnModulesPage() {
        return new ModulesPage();
    }

}
