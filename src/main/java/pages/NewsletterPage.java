package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class NewsletterPage extends CustomersPage{

    public NewsletterPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Newsletter\")]");

    public NewsletterPage checkHeadingCustomersCSVImportExportPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Newsletter", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
