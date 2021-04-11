package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CustomersCSVImportExportPage extends CustomersPage{
    public CustomersCSVImportExportPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" CSV Import/Export\")]");

    public CustomersCSVImportExportPage checkHeadingCustomersCSVImportExportPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "CSV Import/Export", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
