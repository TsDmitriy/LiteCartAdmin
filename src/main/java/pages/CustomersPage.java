package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CustomersPage {

    public CustomersPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Customers\")]");
    private By cSVImportExport = By.xpath("//*[@class=\"docs\"]//*[@id=\"doc-csv\"]");
    private By newsletter = By.xpath("//*[@class=\"docs\"]//*[@id=\"doc-newsletter\"]");


    public CustomersPage checkHeadingCustomersPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Customers", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public CustomersCSVImportExportPage goToCustomersCSVImportExportPage() throws InterruptedException {
        Helpers.click(cSVImportExport);
        return new CustomersCSVImportExportPage();
    }

    public NewsletterPage goToNewsletterPage() {
        Helpers.click(newsletter);
        return new NewsletterPage();
    }
}
